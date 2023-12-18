import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String S =sc.next();
        sc.close();

        int sum = 0;
        if(S.charAt(0) == 'A')
            sum++;
        int count = 0;
        for(int i = 2; i < S.length()-1; i++){
            if(S.charAt(i) == 'C'){
                count++;
            }
        }
        if(count == 1)
                sum++;
        int cnt = 0;
        for(int i = 1; i < S.length(); i++){
            if(S.charAt(i) - 'a' >= 0 && S.charAt(i) - 'a' <= 25){
                cnt++;
            }
        }
        if(cnt==S.length()-2)
                sum++;
        if(sum == 3)
            System.out.println("AC");
        else
            System.out.println("WA");
        
    }
}