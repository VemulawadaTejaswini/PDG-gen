import java.util.Scanner;

//クラス名は必ずMainにする必要があります。



public class Main {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());

        System.out.println((int)(a+Math.pow(a, 2)+Math.pow(a, 3)));
 	}
}