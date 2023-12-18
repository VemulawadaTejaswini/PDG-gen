import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();

        sc.close();

        char[] charArray = s.toCharArray();


        int R = 0;
        int B = 0;
        for(int i=0; i<N; i++){
            char tmp = charArray[i];
            if(tmp == 'R'){
                R++;
            }else{
                B++;
            }
        }

        String result = R>B ? "Yes" : "No";

        System.out.println(result);

    }
}
