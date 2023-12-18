import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double L = sc.nextInt();

        double ans= (L/3)*(L/3)*(L/3);
        System.out.println(String.format("%.8f",ans));
        }
    }