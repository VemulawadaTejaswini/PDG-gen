import java.util.Scanner;
 
public class Main {
 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		String answer;
 
		int n = N;
 
		int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
 
        if((N%sum)==0) answer = "Yes";
        else answer = "No";
 
		sc.close();
 
	    System.out.println(answer);
    }
}