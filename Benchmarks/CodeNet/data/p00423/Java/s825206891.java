import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0)break;
            int A=0,B=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt(),b=sc.nextInt();
                if(a<b){
                    B+=a+b;
                }else if(a>b){
                    A+=a+b;
                }else{
                    A+=a;
                    B+=a;
                }
            }
            System.out.println(A+" "+B);
        }
    }
}