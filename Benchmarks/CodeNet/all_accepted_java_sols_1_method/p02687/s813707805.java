import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        if(str1.equals("ABC")){
            System.out.println("ARC");
        }else if(str1.equals("ARC")){
            System.out.println("ABC");
        }
    }
}