import java.util.Scanner;

public class Main {

    public Main(){
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        String S = sc.next();

        if(S.length() <= K){
            System.out.println(S);
        } else {
            for (int i = 0; i < K; i++) {
                System.out.print(S.charAt(i));
            }
            System.out.println("...");
        }
    }

    public static void main(String[] args) {
        Main M = new Main();
    }
}
