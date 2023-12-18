import java.util.*;

public class Main {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double a = Math.pow(sc.nextInt(), 2);
            double b = Math.pow(sc.nextInt(), 2);
            double c = Math.pow(sc.nextInt(), 2);
            if(a+b==c){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}