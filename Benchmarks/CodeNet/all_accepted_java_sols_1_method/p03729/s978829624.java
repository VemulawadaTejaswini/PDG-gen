import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String C=sc.next();
        char a=A.charAt(A.length()-1);
        char b=B.charAt(0);
        char bb=B.charAt(B.length()-1);
        char c=C.charAt(0);
        if((a==b)&&(bb==c)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
        
     
    }
