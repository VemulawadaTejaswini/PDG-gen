import java.util.Scanner;

public class Main {
	static int [][] map;
	static int N;
	static int total;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		while(sc.hasNext()){
			N=sc.nextInt();
			if(N==0){
				sc.close();
				break;
			}
			initialise(N);
			//値の更新　N-1個分のデータがくる
			for(int i=0;i<N-1;i++){
				x=sc.nextInt()-1;
				y=sc.nextInt()-1;
				map[x][y]=sc.nextInt();
				map[y][x]=map[x][y];
			}

			total=0;
			search(0,0,-1);
			System.out.println(total);
		}

	}

	public static void initialise(int N){
		map=new int [N][N];
		for(int x=0;x<N;x++){
			for(int y=0;y<N;y++){
				map[x][y]=0;
			}
		}
	}

	public static void search(int np,int cost,int pp){
		int count=0;
		for(int x=0;x<N;x++){
			if(map[x][np]!=0 && x!=pp){
				count++;
			}
		}
		if(count==0){
			return;
		}
		total+=cost*2;
		for(int x=0;x<N;x++){
			if(map[x][np]!=0 && x!=pp){
				search(x,map[x][np],np);
			}
		}
	}
}