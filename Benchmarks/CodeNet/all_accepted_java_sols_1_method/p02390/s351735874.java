import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s == 60 || s > 60){
            int m = s/60;
            if(m == 60 || m >60){
                int h = m/60;
                int mr = m-60*h;
                int sr = s-(3600*h+60*mr);
                System.out.println(h+":"+mr+":"+sr);
            }
            else{
                int sr = s-60*m;
                System.out.println("0:"+m+":"+sr);
                System.exit(0);
            }
        }
        else if(s != 0){
            System.out.println("0:0:"+s);
            System.exit(0);
        }
        else{
            System.out.println("0:0:0");
        }
    }
}
