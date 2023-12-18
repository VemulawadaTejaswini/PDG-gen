import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        double ans = Math.sqrt(Math.pow((c-a), 2)+Math.pow((b-d), 2));


        System.out.println(ans);
        sc.close();
	}


}

