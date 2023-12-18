import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double ans = Math.sqrt(Math.pow((c-a), 2)+Math.pow((b-d), 2));


        System.out.println(ans);
        sc.close();
	}


}

