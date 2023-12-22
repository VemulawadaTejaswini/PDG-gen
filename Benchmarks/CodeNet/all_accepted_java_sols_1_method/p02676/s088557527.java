import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String str = sc.next();
        
        if(str.length() > K){
            str = str.substring(0,K) + "...";
        }

        System.out.println(str);
    }
}
