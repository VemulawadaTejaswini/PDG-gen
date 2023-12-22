import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt(), m = in.nextInt(), p = in.nextInt();
			if(n==0 && m==0 && p == 0) return ;
			int total = 0, num=1;
			for(int i=0; i<n; i++){
				int x = in.nextInt();
				if(i==m-1) num = x;
				total += x;
			}
			if(num==0)  System.out.println(0);
			else{
				System.out.println((int) ((double)100*total/num*(100-p)/100));
			}
		}
	}
}