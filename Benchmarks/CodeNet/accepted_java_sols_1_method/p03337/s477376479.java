import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c=a+b,d=a-b,e=a*b;
		int f;
		f=Math.max(c,d);
		System.out.println(Math.max(f,e));

    }
}