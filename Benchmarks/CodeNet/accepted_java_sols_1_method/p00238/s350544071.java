import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        int n;
        int s,f,sum;

        while((t = sc.nextInt())!=0){
            n = sc.nextInt();
            sum=0;
            for(int i=0;i<n;i++){
                s = sc.nextInt();
                f = sc.nextInt();
                sum += (f-s);
            }
            if(sum>=t){System.out.println("OK");}
            else{System.out.println(t-sum);}
        }
    }
}
