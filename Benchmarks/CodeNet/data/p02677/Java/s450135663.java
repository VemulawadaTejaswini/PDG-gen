import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int H = sc.nextInt();
      	int M = sc.nextInt();
		int H2 = (H * 60 + M) * 360 / (12 * 60);
        int M2 = M * 360 / 60;
      	if (M2 == 0) M2 = 360;
      	int kakudo = M2 - H2;
      	
      	double ans = Math.sqrt((A*A)+(B*B)-(2*A*B*Math.cos(Math.toRadians(kakudo))));
        System.out.println(ans);
    }
}