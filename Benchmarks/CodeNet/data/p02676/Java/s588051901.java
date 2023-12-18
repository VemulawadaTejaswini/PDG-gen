import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        String ans = "";
       
        if( s.length() <= k ){
            ans = s;
        }else{
            ans = s.substring(0,k)+"...";
        }

        System.out.println( ans );

    }
}