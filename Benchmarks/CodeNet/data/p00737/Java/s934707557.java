
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main{
	static int[][] map=new int[30][30];  //マップ
	static int ch, cw, cd;
	static int h, w;  //mapサイズ
	static Node[][][] node;  //ノード
	static PriorityQueue<Node> open_queue;
	static Node currentNode;  //計算ノード



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c0,c1,c2,c3;  //直進、右折、反転、左折

		while(true){
			w=sc.nextInt();
			h=sc.nextInt();

			if(w==0 && h==0){break;}

			for(int i=0;i<h;i++){  //マップ情報得る
				for(int j=0;j<w;j++){
					map[i][j]=sc.nextInt();
				}
			}
			c0=sc.nextInt();
			c1=sc.nextInt();
			c2=sc.nextInt();
			c3=sc.nextInt();

			node=new Node[h][w][4];  //値入れる
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					for(int k=0;k<4;k++){
						node[i][j][k]=new Node();
						node[i][j][k].Nh=i;
						node[i][j][k].Nw=j;
						node[i][j][k].Nd=k;
					}
				}
			}
			for(int k=0;k<4;k++){
				node[0][0][k].Start=true;
				node[h-1][w-1][k].Goal=true;
			}

			for(int i=0;i<h;i++){  //コスト入れる
				for(int j=0;j<w;j++){
					for(int k=0;k<4;k++){
						if(k==0){node[i][j][k].cost=c0;}
						else if(k==1){node[i][j][k].cost=c1;}
						else if(k==2){node[i][j][k].cost=c2;}
						else if(k==3){node[i][j][k].cost=c3;}
					}
				}
			}

			for(int i=0;i<h;i++){   //mapと一致ならコスト0
				for(int j=0;j<w;j++){
					for(int k=0;k<4;k++){
						if(map[i][j]==0){node[i][j][0].cost=0;}
						else if(map[i][j]==1){node[i][j][1].cost=0;}
						else if(map[i][j]==2){node[i][j][2].cost=0;}
						else if(map[i][j]==3){node[i][j][3].cost=0;}
					}
				}
			}


			Dykstra();
		}
	}

	static void Dykstra(){
		open_queue = new PriorityQueue<Node>(1, new MyComparator());
		open_queue.add(node[0][0][0]);
		node[0][0][0].f=0;
		while(true){
			currentNode=open_queue.poll();
			if(currentNode.Goal==true){break;}
			Calc();
		}
		System.out.println(currentNode.f);
	}
	static void Calc(){
		ch=currentNode.Nh;
		cw=currentNode.Nw;
		cd=currentNode.Nd;  //0右 1左 2上 3下

		if(ch>0){  //上へ
			if(cd==0){
				if(node[ch-1][cw][2].f>currentNode.f+node[ch][cw][3].cost){
					node[ch-1][cw][2].f=currentNode.f+node[ch][cw][3].cost;  //右から左折して上へ
					open_queue.add(node[ch-1][cw][2]);
				}
			}
			else if(cd==1){
				if(node[ch-1][cw][2].f>currentNode.f+node[ch][cw][1].cost){
					node[ch-1][cw][2].f=currentNode.f+node[ch][cw][1].cost; //左から右折して上へ
					open_queue.add(node[ch-1][cw][2]);
				}
			}
			else if(cd==2){
				if(node[ch-1][cw][2].f>currentNode.f+node[ch][cw][0].cost){
					node[ch-1][cw][2].f=currentNode.f+node[ch][cw][0].cost; //上から直進して上へ
					open_queue.add(node[ch-1][cw][2]);
				}
			}
			else if(cd==3){
				if(node[ch-1][cw][2].f>currentNode.f+node[ch][cw][2].cost){
					node[ch-1][cw][2].f=currentNode.f+node[ch][cw][2].cost; //下から反転して上へ
					open_queue.add(node[ch-1][cw][2]);
				}
			}
		}
		if(ch<h-1){  //下へ
			if(cd==0){
				if(node[ch+1][cw][3].f>currentNode.f+node[ch][cw][1].cost){
					node[ch+1][cw][3].f=currentNode.f+node[ch][cw][1].cost;  //右から右折して下へ
					open_queue.add(node[ch+1][cw][3]);
				}
			}
			else if(cd==1){
				if(node[ch+1][cw][3].f>currentNode.f+node[ch][cw][3].cost){
					node[ch+1][cw][3].f=currentNode.f+node[ch][cw][3].cost; //左から左折して下へ
					open_queue.add(node[ch+1][cw][3]);
				}
			}
			else if(cd==2){
				if(node[ch+1][cw][3].f>currentNode.f+node[ch][cw][2].cost){
					node[ch+1][cw][3].f=currentNode.f+node[ch][cw][2].cost; //上から反転して下へ
					open_queue.add(node[ch+1][cw][3]);
				}
			}
			else if(cd==3){
				if(node[ch+1][cw][3].f>currentNode.f+node[ch][cw][0].cost){
					node[ch+1][cw][3].f=currentNode.f+node[ch][cw][0].cost; //下から直進して下へ
					open_queue.add(node[ch+1][cw][3]);
				}
			}
		}
		if(cw>0){  //左へ
			if(cd==0){
				if(node[ch][cw-1][1].f>currentNode.f+node[ch][cw][2].cost){
					node[ch][cw-1][1].f=currentNode.f+node[ch][cw][2].cost;  //右から反転して左へ
					open_queue.add(node[ch][cw-1][1]);
				}
			}
			else if(cd==1){
				if(node[ch][cw-1][1].f>currentNode.f+node[ch][cw][0].cost){
					node[ch][cw-1][1].f=currentNode.f+node[ch][cw][0].cost; //左から直進して左へ
					open_queue.add(node[ch][cw-1][1]);
				}
			}
			else if(cd==2){
				if(node[ch][cw-1][1].f>currentNode.f+node[ch][cw][3].cost){
					node[ch][cw-1][1].f=currentNode.f+node[ch][cw][3].cost; //上から左折して左へ
					open_queue.add(node[ch][cw-1][1]);
				}
			}
			else if(cd==3){
				if(node[ch][cw-1][1].f>currentNode.f+node[ch][cw][1].cost){
					node[ch][cw-1][1].f=currentNode.f+node[ch][cw][1].cost; //下から右折して左へ
					open_queue.add(node[ch][cw-1][1]);
				}
			}
		}
		if(cw<w-1){  //右へ
			if(cd==0){
				if(node[ch][cw+1][0].f>currentNode.f+node[ch][cw][0].cost){
					node[ch][cw+1][0].f=currentNode.f+node[ch][cw][0].cost;  //右から直進して右へ
					open_queue.add(node[ch][cw+1][0]);
				}
			}
			else if(cd==1){
				if(node[ch][cw+1][0].f>currentNode.f+node[ch][cw][2].cost){
					node[ch][cw+1][0].f=currentNode.f+node[ch][cw][2].cost; //左から反転して右へ
					open_queue.add(node[ch][cw+1][0]);
				}
			}
			else if(cd==2){
				if(node[ch][cw+1][0].f>currentNode.f+node[ch][cw][1].cost){
					node[ch][cw+1][0].f=currentNode.f+node[ch][cw][1].cost; //上から右折して右へ
					open_queue.add(node[ch][cw+1][0]);
				}
			}
			else if(cd==3){
				if(node[ch][cw+1][0].f>currentNode.f+node[ch][cw][3].cost){
					node[ch][cw+1][0].f=currentNode.f+node[ch][cw][3].cost; //下から左折して右へ
					open_queue.add(node[ch][cw+1][0]);
				}
			}
		}
	}
}



class Node{
	int cost; //直進、右折、反転、左折
	int f; //コスト
	int Nh, Nw, Nd;  //場所と向き
	boolean Start;
	boolean Goal;
	
	public Node(){
		cost=0;
		f=Integer.MAX_VALUE;
		Nh=0;
		Nw=0;
		Nd=0;
		Start=false;
		Goal=false;
	}
}

class MyComparator implements Comparator<Object>{
    public int compare(Object obj1, Object obj2) {

        Node num1 = (Node)obj1;
        Node num2 = (Node)obj2;

        if(num1.f>num2.f) {
            return 1;
        } else if(num1.f<num2.f) {
            return -1;
        } else{
            return 0;
        }
    }
}