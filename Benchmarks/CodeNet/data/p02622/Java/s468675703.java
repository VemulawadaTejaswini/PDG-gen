import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner( System.in );
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n = s.length();
        int ans = 0;
        for(int i = 0 ; i < n ;i++){
            if(s.charAt( i )!=t.charAt( i ))
                ans++;
        }
        System.out.println( ans );
    }

}
