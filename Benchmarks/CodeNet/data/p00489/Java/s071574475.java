import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] team = new int[n];
		for(int i=0; i<n; ++i) team[i]=0;
		int[] t = new int[4];
		for(int i=0; i<n*(n-1)/2; ++i){
			for(int j=0; j<4; ++j) t[j] = sc.nextInt();
			if(t[2]>t[3]) team[ t[0]-1 ] +=3;
			else if(t[2]<t[3]) team[ t[1]-1 ] +=3;
			else{
				team[ t[0]-1 ] +=1;
				team[ t[1]-1 ] +=1;
			}
		}
		for(int i=0; i<n; ++i){
			int cnt=0;
			for(int j=0; j<n; ++j){
				if(team[i]<team[j]) ++cnt;
			}
			System.out.println(cnt+1);
		}	
	}
}