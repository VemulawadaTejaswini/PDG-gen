import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x,Ans;
        while(true){
            n=sc.nextInt();
            x=sc.nextInt();
            Ans=0;
            if(n==0&&x==0)
        	break;
            for(int i=1;i<x/3&&i<n-1;i++){
                for(int j=i+1;j<x/2&&j<n;j++){
                    for(int k=j+1;k<n+1;k++){
                        if(i+j+k==x){
                            Ans++;
                            break;
                        }
                    }
                }
            }
            System.out.println(Ans);
        }
    }
}