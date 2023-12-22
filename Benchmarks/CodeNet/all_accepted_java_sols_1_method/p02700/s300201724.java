import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int a = yomi.nextInt();
        int b = yomi.nextInt();
        int c = yomi.nextInt();
        int d = yomi.nextInt();
        while (true){
            c-=b;
            if (c<=0){
                System.out.println("Yes");
                return;
            }
            a-=d;
            if(a<=0){
                System.out.println("No");
                return;
            }
        }

    }
}