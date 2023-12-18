import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] data = new long[n];
		long max = 0;
		for(int i = 0 ; i < n ; i++){
			data[i]=scan.nextInt();
		}
		for(int i = n-1 ; i >= 0 ; i --){
			for(int j = 0 ; j < i ; j ++){
				if(max<(data[i]-data[j])){
					max= data[i]-data[j];
				}
				System.out.println(data[i]-data[j]);
			}
		}
		System.out.println(max);
	}
}