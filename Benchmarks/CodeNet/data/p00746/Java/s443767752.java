import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int m = sc.nextInt();
			if(m==0)break;
			int[] x = new int[m];
			int[] y = new int[m];
				
			for(int i=1;i<m;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				x[i] = x[a] + (b-1)*(1-b%2);
				y[i] = y[a] - (b-2)*(b%2);
			}
			Arrays.sort(x);
			Arrays.sort(y);
			System.out.println((x[m-1]-x[0]+1) + " " + (y[m-1]-y[0]+1));
		}
	}
	
}