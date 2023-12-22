import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i,j,k,x,n,co=0;
        Scanner s = new Scanner(System.in);
        while(true){
            n = s.nextInt();
            x = s.nextInt();
            if(n==0&&x==0)break;
            for(i=1;i<=n;i++){
                for(j=i+1;j<=n;j++){
                    for(k=j+1;k<=n;k++){
                        if(i+k+j==x)co++;
                    }
                }
            }
            System.out.println(co);
            co =0;
        }
    }
}
