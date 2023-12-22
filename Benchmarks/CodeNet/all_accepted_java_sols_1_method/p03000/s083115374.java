import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        String[] l = sc.nextLine().split(" ");

        int n = Integer.parseInt(s1[0]);
        int x = Integer.parseInt(s1[1]);

        int result=1;
        int sum=0;
        for (int i = 0; i < n;i++) {
        	sum=sum+Integer.parseInt(l[i]);
        	if (sum <= x) {
        		result++;
        	} else {
        		break;
        	}
        }

        System.out.println(result);
    }



}