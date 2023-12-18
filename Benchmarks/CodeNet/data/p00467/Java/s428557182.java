
import java.util.Scanner;

public class Main {
	static int N,M,ans;
	static int map[],d[];
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc=new Scanner(System.in);
		int i;

		while(true){
			N=sc.nextInt();
			M=sc.nextInt();
			if(N==0 & M==0) break;

			map=new int[N+1];
			d=new int[M+1];
			for(i=1;i<=N;i++){
				map[i]=sc.nextInt();
			}
			for(i=1;i<=M;i++){
				d[i]=sc.nextInt();
			}		
			
			play(1,0);
			
			System.out.println(ans);
			
		}//while
	}
	
	static void play(int s,int i){
		//System.out.println("s= "+s+" i= "+i);
		if(s>=N){
			//goal
			ans=i;
			return;
		}
		s+=d[i+1];
		if(s<N){
			s=mapaction(s);
		}
		play(s,i+1);
	}
	
	static int mapaction(int s){
		
		if(map[s]==0){
			return s;
		}
		else if(map[s]>0){
			s+=map[s];
			return s;
		}
		else if(map[s]<0){
			s+=map[s];
			return s;
		}
		
		return -1;
	}
}