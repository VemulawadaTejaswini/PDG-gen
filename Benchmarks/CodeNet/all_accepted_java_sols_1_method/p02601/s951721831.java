import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int K = sc.nextInt();
      	int ans = 0;
      	while(A >= B){
          B = B * 2;
          ans += 1;
        }
      	while(B >= C){
          C = C * 2;
          ans += 1;
        }
        if (K >= ans)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}