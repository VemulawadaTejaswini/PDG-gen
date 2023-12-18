import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int flag = 0;
        for (int i=1;i<=9;i++) {
            if (1<=N/i && N/i<=9 && N%i==0) {
                flag=1;
                break;
            }
        }
        if (flag==1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}