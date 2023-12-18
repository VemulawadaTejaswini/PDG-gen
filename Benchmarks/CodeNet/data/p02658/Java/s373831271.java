import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = Integer.parseInt(str);
		long h;
		long g = 0;
		String str1 = sc.next();
		h = Long.parseLong(str1);
		g = h;
		for(int i =0;i<n-1;i++) {
			str1 = sc.next();
			h = Long.parseLong(str1);
			g *= h;
		}

        sc.close();
        if(g > (long)Math.pow(10, 18)) {
        	System.out.println("-1");
        }else {
        System.out.println(g);
        }
	}

}