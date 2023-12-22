import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
        int c=0;
        while(b<=a){
           if(b%2==1){
            c++;
           }
           b++;
        }
       System.out.println((double)c/a);
    }
}