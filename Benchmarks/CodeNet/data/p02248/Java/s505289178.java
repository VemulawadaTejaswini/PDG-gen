import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			char T[] = br.readLine().toCharArray();
			char P[] = br.readLine().toCharArray();

			int index = 1;

			Node[] nodes = new Node[10001];
			for(int i = 0; i < 10001; i++){
				nodes[i] = new Node();
				nodes[i].init();
			}

			int root = 0;

			//★ルートの情報を設定★
			nodes[root].suffix_link = -1;

			int tmp_ch,tmp_loc,parent_id,tmp_index;

			//トライ木を構成する
			tmp_index = 0;
			tmp_ch = P[tmp_index];

			tmp_loc = root;
			tmp_index = 0;

			while(true){

				parent_id = tmp_loc;

				nodes[tmp_loc].children[tmp_ch] = index++; //★新しいノードへ移動する場合★
				//子ノードに移動
				tmp_loc = nodes[tmp_loc].children[tmp_ch];
				nodes[tmp_loc].parent_id = parent_id;

				tmp_index++;

				if(tmp_index == P.length){ //今回の数字が最後の文字だった場合
					nodes[tmp_loc].finish_FLG = true;
					break;
				}
				tmp_ch = P[tmp_index];
			}

			//Suffix_linkを構築する
			int node_id;
			Queue<Info> MAKE_SL = new ArrayDeque<Info>();
			for(int i = 0; i < 128; i++){
				if(nodes[root].children[i] != -1){
					node_id = nodes[root].children[i];
					nodes[node_id].suffix_link = root; //★root直下のsuffix_linkは必ずrootなので、queueには突っ込まない★
					for(int k = 0; k < 128; k++){
						if(nodes[node_id].children[k] != -1){
							MAKE_SL.add(new Info(nodes[node_id].children[k],k)); //ノードのidと、最後の経路をpushする
						}
					}
				}
			}

			while(!MAKE_SL.isEmpty()){
				node_id = MAKE_SL.peek().node_id; //★新たにsuffix_linkを張りたいノードのid★
				tmp_ch = MAKE_SL.peek().ch;
				MAKE_SL.poll();

				for(int i = 0; i < 128; i++){
					if(nodes[node_id].children[i] != -1){
						MAKE_SL.add(new Info(nodes[node_id].children[i],i));
					}
				}

				//★親のsuffix_link先は、自分のsuffix_link先のpre_fixになっているので、親のsuffix_link情報を利用する★

				//tmp_chへ下ることのできる、親からのsuffix_link先のノードを探す
				for(tmp_loc = nodes[nodes[node_id].parent_id].suffix_link; tmp_loc != root; tmp_loc = nodes[tmp_loc].suffix_link){
					if(nodes[tmp_loc].children[tmp_ch] != -1){
						break;
					}
				}

				if(tmp_loc == root){
					if(nodes[root].children[tmp_ch] != -1){
						nodes[node_id].suffix_link = nodes[root].children[tmp_ch];
					}else{
						nodes[node_id].suffix_link = root;
					}
				}else{
					nodes[node_id].suffix_link = nodes[tmp_loc].children[tmp_ch];
				}
			}

			StringBuilder ans = new StringBuilder();
			int ans_count = 0;

			//T上の文字を走査する
			tmp_loc = root;
			for(int i = 0; i < T.length; i++){
				tmp_ch = T[i];

				if(nodes[tmp_loc].children[tmp_ch] != -1){ //次の文字が繋がる場合
					tmp_loc = nodes[tmp_loc].children[tmp_ch]; //次のノードに移動する

					if(nodes[tmp_loc].finish_FLG){
						ans.append(Integer.toString(i-P.length+1)).append("\n"); //左端の位置を出力
						ans_count++;
						tmp_loc = nodes[tmp_loc].suffix_link;
					}
				}else{ //次の文字と一致しない場合→suffix_linkを辿る

					if(tmp_loc == root)continue;

					for(tmp_loc = nodes[tmp_loc].suffix_link; tmp_loc != root; tmp_loc = nodes[tmp_loc].suffix_link){
						if(nodes[tmp_loc].children[tmp_ch] != -1){
							break;
						}
					}
					if(nodes[tmp_loc].children[tmp_ch] != -1){ //tmp_chへと繋がるノードに辿り着いた場合
						tmp_loc = nodes[tmp_loc].children[tmp_ch];
						//少なくとも1文字遡るので、ここでfinish_FLGがtrueになることはない
					}else{
						//Do nothing (tmp_loc == rootであるはず)
					}
				}
			}

			if(ans_count > 0){
				System.out.print(ans.toString());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class Node{
	public int parent_id;
	public int[] children;
	public int suffix_link;
	public boolean finish_FLG;

	Node(){
		children = new int[128];
	}
	public void init(){
		for(int i = 0; i < children.length; i++){
			children[i] = -1;
		}
		finish_FLG = false;
	}
};

class Info{
	public int node_id;
	public int ch;
    Info(int arg_node_id,int arg_ch){
        node_id = arg_node_id;
        ch = arg_ch;
    }
};
