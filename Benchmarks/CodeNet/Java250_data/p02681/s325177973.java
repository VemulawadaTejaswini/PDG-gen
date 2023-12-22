import java.util.Scanner;

public class Main {

    public Main(){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        if(T.startsWith(S)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Main M = new Main();
    }
}
