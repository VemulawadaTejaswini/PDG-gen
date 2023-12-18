import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n,x;
            int sum=0,M=0;

            n=sc.nextInt();
            x=sc.nextInt();
            if(n==0&&x==0){
                break;
            }
            for(int i=1;i<=n;i++){
                for(int j=i+1;j<=n;j++){
                    for(int k=j+1;k<=n;k++){
                       sum= i+j+k;
                       if(sum==x){
                           M+=1;
                       }

                    }
                }
            }

            System.out.println(M);
        }

        sc.close();
    }
}
