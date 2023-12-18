import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s;
        int m;
        int h;
        int i;
        while(!(s=sc.next()).equals("-")){
            m=sc.nextInt();
            for(i=0;i<m;i++){
                h=sc.nextInt();
                s=s.substring(h,s.length())+s.substring(0,h);
            }
            System.out.println(s);
        }
    }
}
