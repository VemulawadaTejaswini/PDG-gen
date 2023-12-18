import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int data = scan.nextInt();
			for(int Case = 0;Case < data;Case++){
				int n = scan.nextInt();
				int k = scan.nextInt();
				int[] x = new int[n-1];
				int a = scan.nextInt();
				int b;
				int sum = 0;
				for(int i = 0;i < n-1;i++){
					b = scan.nextInt();
					x[i] = b - a;
					a = b;
					sum += x[i];
				}
				if(n <= k){
					System.out.println(0);
				}else{
					Arrays.sort(x);
					for(int i = 0;i < k-1;i++){
						sum -= x[x.length-1-i];
					}
					System.out.println(sum);
				}
			}
		}
	}
}