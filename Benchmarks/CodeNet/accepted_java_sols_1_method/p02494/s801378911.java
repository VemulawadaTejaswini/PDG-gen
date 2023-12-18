import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 
        int h = sc.nextInt();
        int w = sc.nextInt();
        for (; h != 0 || w != 0;) {
            StringBuffer line = new StringBuffer();
            for (int i = 0; i < w; i++) {
                line.append('#'); 
            }
            for (int i = 0; i < h; i++) {
                System.out.println(line);
            }
            System.out.println("");
             
            h = sc.nextInt();
            w = sc.nextInt();
        }
         
        sc.close();
    }
}