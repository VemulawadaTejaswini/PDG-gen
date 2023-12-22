import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        
        long sa = V-W;
        long kyori = Math.abs(A-B);
        
        if(sa*T>=kyori){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
