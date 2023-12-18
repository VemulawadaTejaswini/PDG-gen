import java.util.Scanner;

public class Main {


	static double esp = 0.000000001;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String string = cin.next();
			String[] s = string.split(",");
			int[] a = new int[11];
			int v1 = Integer.parseInt(s[10]);
			int v2 = Integer.parseInt(s[11]);
			int[] sum = new int[11]; 
			for(int i = 0; i< 10;i++){
				a[i+1] = Integer.parseInt(s[i]);
				sum[i+1] += sum[i] + a[i+1];
			}
			double kyori = (double)v1 * (double)sum[10]/(double)(v1+v2);
			for(int i = 1; i <= 10; i++){
				if(sum[i] >= kyori){
					System.out.println(i);
					break;
				}
			}
		}
	}

}