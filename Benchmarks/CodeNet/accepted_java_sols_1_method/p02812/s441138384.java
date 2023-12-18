import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int numOccurences = 0;
        for (int i=0;i<N;i++){
            if (S.charAt(i)=='A'&&(i+2)<N){
                if (S.charAt(i+1)=='B'&&S.charAt(i+2)=='C'){
                    numOccurences++;
                }
            }
        }
        System.out.println(numOccurences);
    }
}

