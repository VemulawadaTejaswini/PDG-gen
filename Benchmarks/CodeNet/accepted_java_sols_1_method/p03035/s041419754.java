import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
	int ans = 0;
	if(13<=a) {
		ans = b;
	}
	else if(6<=a&&a<=12) {
		ans = b/2;
	}
	else {ans =0;
	}
	System.out.println(ans);
	}

}
