import java.util.*;
        import java.io.*;
        import java.lang.*;
public class Main{
    private static void Solve(){
        Scanner in = new Scanner(System.in);
        int n; n = in.nextInt();
        String ss = in.next();
        StringBuilder str = new StringBuilder(ss);
        //System.out.println(str);
        int count = 1;
        for(int i=1;i<str.length();i++){
           // System.out.println("Hello");
            if(str.charAt(i) != str.charAt(i-1))
                count++;
        }
        System.out.println(count);
    }
    public static void main(String []args){
        Solve();
    }
}