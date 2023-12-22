import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        char[] c = sc.next().toCharArray();
        int indA = 1;
        int indB = 0;
        int indC = 0;
        char now = 'a';
        while(indA <= a.length && indB <= b.length && indC <= c.length){
            if(now == 'a'){
                if(indA == a.length){
                    System.out.println("A");
                    return;
                }
                indA++;
                now = a[indA-1];
            }else if(now == 'b'){
                if(indB == b.length){
                    System.out.println("B");
                    return;
                }
                indB++;
                now = b[indB-1];
            }else{
                if(indC == c.length){
                    System.out.println("C");
                    return;
                }
                indC++;
                now = c[indC-1];
            }
        }
    }
}
