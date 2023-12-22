import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int k = yomi.nextInt();
        int a = yomi.nextInt();
        int b = yomi.nextInt();
        for (int i=a;i<=b;i++){
            if (i%k==0){
                System.out.println("OK");
                return;
            }
        }
        System.out.println("NG");

    }
}