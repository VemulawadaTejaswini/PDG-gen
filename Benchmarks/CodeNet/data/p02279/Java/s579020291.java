import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bfr.readLine());		//ここでノードの数（葉っぱの数が分かる）
		Node[] nds=new Node[num];		//ノードを宣言		また未宣言  それぞれのノードについて　new Nodeしなければならない
		StringTokenizer stk;
		StringBuilder stb;
		for(int i=0; i<num; i++) {
			nds[i]=new Node(i);
		}

		for(int i=0; i<num; i++) {
			stk=new StringTokenizer(bfr.readLine());		//idを入力
			int id=Integer.parseInt(stk.nextToken());
			int kazu=Integer.parseInt(stk.nextToken());		//子ノードの数を取得
			nds[id].children_number=kazu;				//親ノードの持つ子ノードの数
			if(kazu==0) {
				nds[id].stats="leaf";		//子ノードを持たないノードは末端であることが分かる
			}
			else {
				nds[id].children=new int[kazu];		//子ノードの宣言
				for(int j=0; j<kazu; j++) {
					int childid=Integer.parseInt(stk.nextToken());		//子ノードのID
					nds[id].children[j]=childid;		//子ノードのIDを付加
					nds[childid].parent=id;	//親ノードの情報についている子ノードの情報から　親ノードのID main由来
					nds[childid].hasparent=true;		//子ノードは親ノードを持っているということになる
				}
			}
		}

		for(int i=0; i<num; i++) {	//深さの計算
			if(nds[i].depth<0) {
				nds[i].setDepth(i,nds);		//nds[i]の深さを設定する（計算する）  ndsツリーのIDがiのノードのidを設定する。
			}
		}

		for(int i=0; i<num; i++) {		//ある木のノード全てのプロパティを知る
			Node an=nds[i];			//あるノードidを見る
			stb=new StringBuilder();
			stb.append("node ");
			stb.append(i);			//あるノードid
			stb.append(": parent = ");
			stb.append(an.parent);	//あるノードidの親ノード
			stb.append(", depth = ");
			stb.append(an.depth);	//あるノードの深さ
			stb.append(", ");
			stb.append(an.stats);	//このノードの種類  葉っぱなのかルートなのか
			stb.append(", [");
			if(an.children_number!=0) {//もしあるノードが子ノードを持たないなら
				for(int j=0; j<an.children_number; j++) {
					stb.append((an.children[j]));
					if(j!=an.children_number-1) {		//最後の1つの親ノードの持つ子ノードでないなら
						stb.append(", ");
					}
				}
			}
			stb.append("]");
			System.out.println(stb);
		}
		System.out.flush();

		}

	static class Node{
		int id;				//ノードのID
		int parent;			//このノードが繋がれている親ノードのID
		int depth;			//頂点?		いらないかも
		int children_number;//子ノードの数
		String stats;		//このノードの情報
		int[] children;		//このノードにつながっている子階層のノードのID
		boolean hasparent;	//親のノードを持っているか

		//これ以降に　weight（重み）　searched（探索済みかどうかのフラグ）などを実装する

		Node(int id){
			this.id=id; this.parent=-1; this.depth=-1; children_number=-1; this.stats="internal node"; hasparent=false;
		}

		void setDepth(int now,Node[] ns){		//ノードの深さ（頂点のノードから何個下の階層にあるか）
			if(ns[now].hasparent==false) {		//ns[now]が親を持たない時 nsは渡された木　nowはノードID
				ns[now].stats="root";
				ns[now].depth=0;
			}
			else {
			ns[now].depth=ns[(ns[now].parent)].depth+1;		//子の親の深さよりも1だけ深いので
			}
		}
	}
}
