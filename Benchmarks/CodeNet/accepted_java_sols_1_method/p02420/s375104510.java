import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String a = sc.next();
            if(a.equals("-")) break;
            int m = sc.nextInt();
            int h[] = new int[m];
            for(int i = 0; i < m; i ++){
                h[i] = sc.nextInt();
            }
            
            for(int i = 0; i < m; i++) {
                a = a.substring(h[i], a.length()) + a.substring(0, h[i]);
            }
            System.out.println(a);
        }
    }
}
