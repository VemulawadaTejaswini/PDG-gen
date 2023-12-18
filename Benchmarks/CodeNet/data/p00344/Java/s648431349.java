import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m[] = new int[n], c = 0;
        boolean[] t=new boolean[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0,p=i; j < n; j++) {
                p=(p+m[p])%n;
                if(t[i]||i==p) {
                    c++;
                    t[i]=true;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
