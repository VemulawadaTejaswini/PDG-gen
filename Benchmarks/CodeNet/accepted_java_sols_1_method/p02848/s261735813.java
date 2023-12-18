import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = scan.nextInt();
        String text = scan.next();
        String ans = "";
        for(int i=0; i<text.length(); i++){
            int a = (text.charAt(i) + key);
            if(a>=91)a-=26;
            char b = (char)a;
           ans = ans + String.valueOf(b);
        }
        System.out.println(ans);
    }
}
