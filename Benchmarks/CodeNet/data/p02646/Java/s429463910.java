import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
      	int V = sc.nextInt();
      	int B = sc.nextInt();
      	int W = sc.nextInt();
      	int T = sc.nextInt();
        long A1 = A + (V*T);
      	long B1 = B + (W*T);
        if(A1 >= B1){
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
        
    }
}