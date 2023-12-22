import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] NAB = line.split(" ");
        
        int N = Integer.parseInt(NAB[0]);
        int A = Integer.parseInt(NAB[1]);
        int B = Integer.parseInt(NAB[2]);
        
        // 最大値を求める
        int max = 0;
        
        if(A == B) {
            max = A;
        } else if(A > B) {
            max = B;
        } else if(B > A) {
            max = A;
        }
        
        // 最小値を求める
        int min = B - (N-A);
        
        if(min < 0) {
            min = 0;
        }
        
        System.out.println(max + " " + min);
    }
}
