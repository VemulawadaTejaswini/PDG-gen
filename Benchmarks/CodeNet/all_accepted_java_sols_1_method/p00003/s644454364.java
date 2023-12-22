import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sides[] = new int[3];
		int rank[] = new int[3];

		for(int i=0;i<N;i++){
			sides[0]=sc.nextInt();
			sides[1]=sc.nextInt();
			sides[2]=sc.nextInt();
			rank[0]=sides[0];
			rank[1]=sides[1];
			rank[2]=sides[2];

			for(int j=0;j<2;j++){
				if(sides[j]<sides[j+1]){
					rank[j]=sides[j+1];
					rank[j+1]=sides[j];
				}
			}
			if(rank[0]<rank[1]){
				rank[0]=rank[1];
				rank[1]=sides[0];
			}

			if(rank[0]*rank[0]==rank[1]*rank[1]+rank[2]*rank[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}
}
