import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String p = sc.next();
        
        //文字列sを2つつなげる
        s = s + s;
        
        //文字列sの中に文字列pが含まれる場合
        if(s.contains(p)) System.out.println("Yes");
        else System.out.println("No");

    }

}

