import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int m = Math.abs(Math.max(a1,Math.max(a2,a3)) - Math.min(Math.min(a1,a2),a3));
        System.out.println(m);
    }
}
