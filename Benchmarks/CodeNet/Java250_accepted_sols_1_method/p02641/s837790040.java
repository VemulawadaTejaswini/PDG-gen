import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Integer[] p = new Integer[n];
        for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for(int a = 0; a < 1000; a++) {
			if(!(Arrays.asList(p).contains(x - a))){
			System.out.println(x - a);
			return;
			}
			else if(!(Arrays.asList(p).contains(x + a))){
			System.out.println(x + a);
			return;
			}
		}
	}
}