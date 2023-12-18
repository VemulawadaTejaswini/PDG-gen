import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        int h,m,s;
        t = sc.nextInt();
        
        h = t/3600;
        m = (t/60)-(h*60);
        s = t-((h*3600)+(m*60));
        
        System.out.println(h+":"+m+":"+"s");
        
        sc.close();
        
        
    }
}
