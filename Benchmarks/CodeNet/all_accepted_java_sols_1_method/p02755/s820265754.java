import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();

        int i = 1;
        int ans = -1;
        while(true) {
        	int tempA = (i * 8) / 100;
        	int tempB = i / 10;

        	if(tempA == a && tempB ==b) {
        		ans = i;
        		break;
        	}
        	if(tempA > a || tempB > b) {
        		break;
        	}
        	i++;
        }
        System.out.println(ans);
    }
}
