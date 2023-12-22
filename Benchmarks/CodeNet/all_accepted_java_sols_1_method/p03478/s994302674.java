import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int total = 0;
		for(int i = 1;i <= n;i++) {
		    int sum = 0;
		    int tmp = i;
		    while(tmp > 0) {
		        sum += tmp % 10;
		        tmp /= 10;		        
		    }
		    
		    if(sum >= a && sum <= b) total += i;
		}
		
		System.out.println(total);
    }
}