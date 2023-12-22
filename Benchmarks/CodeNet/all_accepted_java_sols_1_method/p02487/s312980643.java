import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 
        int h = sc.nextInt();
        int w = sc.nextInt();
        for (; h != 0 || w != 0;) {
            StringBuffer line = new StringBuffer();
            StringBuffer inline = new StringBuffer();
            for (int i = 0; i < w; i++) {
                line.append('#');
                if (i == 0 || i == w -1) {
                    inline.append('#');
                } else {
                    inline.append('.');
                }
            }
            for (int i = 0; i < h; i++) {
                if (i == 0 || i == h -1) {
                    System.out.println(line);
                } else {
                    System.out.println(inline);
                }
            }
            System.out.println("");
             
            h = sc.nextInt();
            w = sc.nextInt();
        }
         
        sc.close();
    }
}