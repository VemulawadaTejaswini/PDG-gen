import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] sp = line.split("");
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int c = Integer.parseInt(sp[2]);
        if(a == 7 || b == 7 || c == 7) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}