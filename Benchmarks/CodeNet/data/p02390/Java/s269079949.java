import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int S = sc.nextInt();
        int h = 0, m = 0,s = 0;
        h = S/3600;
        m = S%3600/60;
        s = S%3600%60;
        
        System.out.println(h+":"+m+":"+s);
        sc.close();
    }
}
