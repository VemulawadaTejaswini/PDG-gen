import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0,y=0,t=0,f=0;
        for(int i=0,tt,tx,ty;i<n;i++){
            tt=sc.nextInt();
            tx=sc.nextInt();
            ty=sc.nextInt();
            if(((Math.abs((tx-x))+Math.abs((ty-y)))%2!=(tt-t)%2)||(Math.abs(tx-x)+Math.abs(ty-y)>(tt-t))){
                 f=1;
        }
            t=tt;
            x=tx;
            y=ty;
        }
        if(f==0)System.out.println("Yes");
        else System.out.println("No");
        


        }
        
    }
    

