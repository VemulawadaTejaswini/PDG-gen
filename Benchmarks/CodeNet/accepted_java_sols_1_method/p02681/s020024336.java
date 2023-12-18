import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        if(str.equals(str2.substring(0,str2.length()-1))){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}