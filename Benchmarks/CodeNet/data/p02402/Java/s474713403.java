import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n, mi=1000000, ma=-1000000;
        long su=0;
        
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i=0; i<n; i++){
            int tmp = s.nextInt();
            mi = Math.min(mi,tmp);
            ma = Math.max(ma,tmp);
            su += tmp;
        }
        System.out.println(mi+" "+ma+" "+su);
    }
}
