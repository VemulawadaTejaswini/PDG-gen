import java.util.*;

public class Main{
    public static boolean judge(int  n){
        return n>=30;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String s = "";

        while(sc.hasNext()){
            s = sc.next();
        }
        sc.close();
        
        //String s = "\\(-5\\)";
        String s0 = s.substring(2,s.length()-2);
        int n = Integer.valueOf(s0);

        if(judge(n)) System.out.println("Yes");
        else System.out.println("No");

    }
}