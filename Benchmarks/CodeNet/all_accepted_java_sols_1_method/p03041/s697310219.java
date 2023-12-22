import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        String S = sc.next();
        
        String[] strArray = S.split("");
        strArray[K-1] = strArray[K-1].toLowerCase();

        for(int i=0; i < strArray.length; i++){
            System.out.print(strArray[i]);
        }
    }
}