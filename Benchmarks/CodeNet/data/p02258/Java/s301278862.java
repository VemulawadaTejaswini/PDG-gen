import java.util.Scanner;

public class Main {

	static int maxProfit(int[]a){
		int ans=Integer.MIN_VALUE;
		int minnum=0;
		int min= a[0];
		for (int i = minnum + 1; i < a.length; i++) {
            ans = Math.max (ans, a[i] - min);
			if (min > a[i]){
			    min = a[i];
			    minnum = i;
			}
        }
		return ans;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int nx = stdIn.nextInt();
        int [] x = new int[nx];

        for(int i = 0; i < nx; i++){
        	x[i] = stdIn.nextInt();
        }

        System.out.println(maxProfit(x));
	}
}


