import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num=0;
        for(int i=0;i<N;i++) {
            int n = sc.nextInt();
            if(n!=i+1) num++;
        }
        if(num<=2) System.out.println("YES");
        else System.out.println("NO");
    }
}
