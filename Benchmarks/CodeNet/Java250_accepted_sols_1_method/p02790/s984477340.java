import java.util.*;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int  com = 0;
        String c = " ";
        String d = " ";
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0;i<b;i++){//aをb個並べる
        	c=c+String.valueOf(a);
        }
       	for(int k=0;k<a;k++){//bをa個並べる
        	d =d+String.valueOf(b); 
        }
        //System.out.println(c);
        //System.out.println(d);
        com = c.compareTo(d);
        
        if(com<=0){
        	System.out.println(c);
        }else{
        	System.out.println(d);
        }
    }
}