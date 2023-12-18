import java.util.Scanner;

public class Main{
    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
       String p ="+";
       String m ="-";
       String t ="*";
       String d ="/";
       String q ="?";
       while(true){
       int a =sc.nextInt();
       String str = sc.next();
       int b =sc.nextInt();
        if(str.equals(q)){
        break;
        }   
        if(str.equals(p)){
           int ans =a+b;
           System.out.println(ans);
        }
        if(str.equals(m)){
           int ans =a-b;
           System.out.println(ans);
        }
        if(str.equals(t)){
            int ans =a*b;
            System.out.println(ans);
        }
        if(str.equals(d)){
            int ans =a/b;
            System.out.println(ans);
        }
       }
       sc.close();
    }
}

