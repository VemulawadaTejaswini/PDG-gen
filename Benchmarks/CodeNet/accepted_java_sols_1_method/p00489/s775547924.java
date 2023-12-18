import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		int game=N*(N-1)/2;
		int point[] =new int[N];
		for(int i=0;i<game;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			if(c<d){
				point[b-1]=point[b-1]+3;
			}else if(c>d){
				point[a-1]=point[a-1]+3;
			}else if(c==d){
				point[a-1]=point[a-1]+1;
				point[b-1]=point[b-1]+1;
			}
		}//ここまで得点計算
		int rnk[]=new int[N];
		for(int i=0;i<N;i++){
		rnk[i]=1;
		for(int j=0;j<N;j++){
		if(point[i]<point[j]){
		rnk[i]=rnk[i]+1;
		}
	}
}
		for(int i=0; i<N;i++){
		System.out.println(rnk[i]);
		}
	}
}