import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,p,cnt=0;
        while(true){
            a=sc.nextInt();b=sc.nextInt();cnt=0;
            if(a==0 && b==0)break;
            for(int i=1;i<=a-2;i++){
                for(int j=i+1;j<=a-1;j++){
                    p=b-(i+j);
                    if(j<p && p<=a)cnt++;
                }
            }
            System.out.println(cnt);
        }
 
    }
}
