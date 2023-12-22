
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();


        if(S.length()==0){
            System.out.println(0);
        }

        int count1=0;
        //010101
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c != '0' && i%2==0){
                count1++;
            }
            if(c != '1' && i%2==1){
                count1++;
            }
        }
        int count2=0;
        //10101
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c != '0' && i%2==1){
                count2++;
            }
            if(c != '1' && i%2==0){
                count2++;
            }
        }


        System.out.println(Math.min(count1,count2));

    }
}
