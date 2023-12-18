import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n!=0){
			int[] l = new int[n];
			routine(n,-1, 0, l);
			n = scan.nextInt();
		}
	}
	
	private static void routine(int n, int m, int depth, int[] l){
		if(n==0){
			for(int j=0; j<depth; j++){
				System.out.print(l[j]);
				if(j!=depth-1)	System.out.print(" ");
			}
			System.out.println();
			return;
		}else{
			for(int i=n; i>0; i--){
				if(i>m && m!=-1)	continue;
				l[depth] = i;
				routine(n-i, i, depth+1, l);
			}
		}
	}

}