import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        if(s.length()%2!=0){
            System.out.println("No");
            return;
        }
        for(int i=0;i<s.length();i+=2)
        {
            if(!s.substring(i,i+2).equals("hi"))
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}