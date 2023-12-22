import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        //String s = sc.next();
        
        int tmp=0;
        if(a<b){
            tmp = b;
            b=a;
            a=tmp;
        }
        //a>bになった
        while(a%b>0){
            tmp=a%b;
            a=b;
            b=tmp;
        }
        
        int k = Integer.parseInt(sc.next());
        tmp=0;
        int i=b+1;
        while(tmp<k){
            i--;
            if(b%i==0) tmp++;
        }
        
        System.out.println(i);
    }
}