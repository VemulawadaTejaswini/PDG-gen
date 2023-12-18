import java.util.*;
public class Main{
    public static void main(String[] args){
        int count=0;
        int i,j,k,n,x;
        Scanner sc=new Scanner(System.in);
        while(true){
            n=sc.nextInt();
            x=sc.nextInt();
            if(n==0 && x==0) break;
            for(i=1;i<=n;i++){
                for(j=i+1;j<=n;j++){
                    for(k=j+1;k<=n;k++){
                        if(i+j+k==x){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
