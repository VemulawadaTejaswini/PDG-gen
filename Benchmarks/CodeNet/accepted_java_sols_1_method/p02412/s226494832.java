import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int x=scan.nextInt();
        int outpint;
        
        while(!(n==0&&x==0)){
            outpint=0;
            for(int i=1; i<n-1; i++)
                for(int j=i+1; j<n; j++)
                    for(int k=j+1; k<n+1; k++){
                        if(i+j+k==x)
                            outpint++;
                    }
            
            n=scan.nextInt();
            x=scan.nextInt();
        System.out.println(outpint);
        }
    }
}
