import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String ans=" ";
        if(A.length()>B.length()) ans = "GREATER";
        else if(A.length()<B.length()) ans = "LESS";
        else{
            for(int i=0;i<A.length();i++){
                int a = A.charAt(i);
                int b = B.charAt(i);
                if(a!=b){
                    ans = a>b?"GREATER":"LESS";
                    System.out.println(ans);
                    System.exit(0);
                }
                ans = "EQUAL";
            }
        }
        System.out.println(ans);
    }
}
