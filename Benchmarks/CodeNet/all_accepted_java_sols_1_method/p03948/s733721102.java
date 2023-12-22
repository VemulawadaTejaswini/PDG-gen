import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextInt();
		long min=Long.MAX_VALUE;
		long profit=0;
		int count=1;
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			if(i!=0 && a-min>=profit){
				if(profit==a-min){
					count++;
				}else{
					count=1;
				}
				profit=a-min;
			}
			if(min>a){
				min=a;
			}
		}
		System.out.println(count);
	}
}
