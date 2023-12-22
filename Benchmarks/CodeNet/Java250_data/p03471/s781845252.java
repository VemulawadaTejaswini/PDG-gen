import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=sc.nextInt();
        int a=-1;
        int b=-1;
        int c=-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                    if(y/1000-10*i-5*j==n-j-i && n-j-i>=0){
                        a=i; b=j; c=n-i-j;
                        break;
                }
            }
        }
        System.out.println(a+" "+b+" "+c);
        
    }
}