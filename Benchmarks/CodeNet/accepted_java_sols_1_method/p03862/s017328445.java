import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		long max = sc.nextLong();
		long count = 0;
		long[] c = new long[number];
		for(int i = 0; i < number; i++){
			long a = sc.nextLong();
			c[i]=a;
		}
		for(int i = 1; i < number; i++){
			if(c[i-1]+c[i]>max){
				count += c[i]-max+c[i-1];
				if(((c[i-1]+c[i])-max) < c[i]){
					
					c[i]=max-c[i-1];
				}else{
					
					
					c[i]=0;
				}
			}
		}
		System.out.println(count);
	}
}