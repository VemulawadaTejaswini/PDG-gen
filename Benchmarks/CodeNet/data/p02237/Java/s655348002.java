import java.util.Scanner;
public class Main{
final static int MAX=100;
	public static void main(String[] args) {
		int i,j,n,pn,num;
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		n=sca.nextInt();
		int[][]graph=new int[MAX+1][MAX+1];
		for(i=1;i<=n;i++){
			num=sca.nextInt();
			pn=sca.nextInt();
			for(j=0;j<pn;j++){
				graph[num][sca.nextInt()]=1;
			}
		}
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				System.out.print(graph[i][j]);
				if(j+1<=n)System.out.print(" ");
			}
			System.out.println("");
		}

	}

}

