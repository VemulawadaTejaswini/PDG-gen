import java.awt.Stroke;
import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String N=sc.nextLine();
        char[] NN=new char[N.length()];
        for(int i=0;i<N.length();i++){
            NN[i]=N.charAt(i);

        }
        int sum=0;
        for(int i=0;i<N.length();i++){
            int a=Integer.parseInt(""+NN[i]);
            sum=sum+a;
        }
        int x=Integer.parseInt(N);
        if(x%sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
        

    }
}