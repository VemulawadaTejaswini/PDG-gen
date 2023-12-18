import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		for(int n=0,i=0;b>=(a+i);++i) {
			if(c%(a+i)==0) {
			++n;
			}
			if(b==(a+i))
			System.out.println(n);
		}
    }
}
