import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        String[] ar = S.split("");

        int maxLength = 0;
        int tmp = 0;

        for (int i = 0; i < ar.length; i++){
            
            if (ar[i].equals("A") || ar[i].equals("T") || ar[i].equals("G") || ar[i].equals("C")) {
                tmp++;
            } else {
                tmp = 0;
            }

            if (tmp > maxLength) {
                maxLength = tmp;
            }

        }

        System.out.println(maxLength);
     }
}
