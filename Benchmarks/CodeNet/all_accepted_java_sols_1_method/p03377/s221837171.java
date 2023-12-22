import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
		int count=0;
		if (a<=x && x<=a+b){
			System.out.print("YES");
        }else{
        	System.out.print("NO");
        }
    }
}