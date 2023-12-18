import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int a = Integer.parseInt(sc.next());
        int v = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        
        if(v <= w){
            System.out.println("NO");
        }else{
            long x = v-w;
            x *= t;
            if(x >= Math.abs(a-b)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}