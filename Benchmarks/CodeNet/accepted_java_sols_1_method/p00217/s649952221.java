import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int p,d1,d2;
            int pp=0;
            int max=0;
            for(int i=0;i<n;i++){
                p=sc.nextInt();
                d1=sc.nextInt();
                d2=sc.nextInt();
                if(d1+d2>max){
                    max=d1+d2;
                    pp=p;
                }
            }
            System.out.println(pp+" "+max);
        }
    }
}
