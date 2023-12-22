import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String str = String.valueOf(S1);
        String W2=null;
        String W1=null;
        for(int count=1;count<=4;count++){
         W1 = str.substring(count-1,count);
            if(W1.equals(W2)){
            System.out.print("Bad");
            return;
        }
        W2=W1;
        }
        System.out.print("Good");
   	 }
}