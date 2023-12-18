import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        for(int i = 0; i < num; i++){
          System.out.print(a.substring(i, i+1) + b.substring(i, i+1));
        }
        System.out.println();
    }
}