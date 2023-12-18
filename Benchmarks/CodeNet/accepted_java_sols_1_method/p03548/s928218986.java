import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Z=sc.nextInt();
        X=X-Y-2*Z;
        int n=1;
        for(int i=0;X>=Y+Z;i++){
            X=X-Y-Z;
            n++;


        }
        System.out.println(n);

        
        
     
    }
}