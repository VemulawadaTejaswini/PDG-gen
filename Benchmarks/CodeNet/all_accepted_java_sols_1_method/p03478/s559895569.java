
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
        	int judge = 0;
        	int now = i;
        	while(true) {
        		judge += now % 10;
        		if(now < 10) {
        			break;
        		}
        		now /= 10;
        	}
        	if(judge >= a && judge <= b) {
        		sum += i;
        	}
        }
        System.out.println(sum);
    }
}