import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int hyou[][] = new int[n][3];
		for(int s=0;s<n;s++){
			for(int i=0;i<3;i++){
				hyou[s][i]=in.nextInt();
			}
		}
		int ten[] = new int[n];
		for(int i=0;i<n;i++)ten[i]=0;
		for(int s=0;s<3;s++){
			int kensa[] = new int[n];
			for(int i=0;i<n;i++){
				for(int k=i+1;k<n;k++){
					if(hyou[i][s]==hyou[k][s]){
						kensa[i]=-1;
						kensa[k]=-1;
						continue;
					}
				}
			}
			for(int k=0;k<n;k++){
				if(kensa[k]!=-1)ten[k]+=hyou[k][s];
			}
		}
		for(int i=0;i<n;i++)System.out.println(ten[i]);


	}
}