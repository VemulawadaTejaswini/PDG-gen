
import java.util.Scanner;
 
 
public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 1;
        for(int i=0;i<n;i++){
            long a = sc.nextLong();
            s = s * a;
        }
        s = s - 1;
        String sl = Long.toString(s);
        if(sl.length()>18){
            System.out.println(-1);
        }else{
            System.out.println(s+1);
        }
        sc.close();
    }
}