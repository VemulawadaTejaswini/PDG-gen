import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int s=(int)Math.min(a/0.08,b/0.1);
        int min=1251;
        for(int i=s;i<1251;i++){
            if((int)(i*0.08)==a&&(int)(i*0.1)==b){
                min=(int)Math.min(i,min);
            }
        }
        if(min==1251)min=-1;
        System.out.println(min);
    }
}