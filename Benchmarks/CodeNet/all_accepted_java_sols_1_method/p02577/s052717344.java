import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sum=0;
        for(int i=0;i<num.length();i++){
            int x =Character.getNumericValue(num.charAt(i));
            sum+=x;
        }
        if(sum%9==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}