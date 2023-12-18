import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=b&&b<=c){
        	System.out.println("%d %d %d",a,b,c);
         	}
         	
         	if(a<=c&&c<=b){
         		System.out.println("%d %d %d",a,c,b);
         	}
         	if(b<=a&&a<=c){
         		System.out.println("%d %d %d",b,a,c);
         	}
         	if(b<=c&&c<=a){
         		System.out.println("%d %d %d",b,c,a);
         	}
         	if(c<=a&&a<=b){
         		System.out.println("%d %d %d",c,a,b);
         	}
         	if(c<=b&&b<=a){
         		System.out.println("%d %d %d",c,b,a);
         	}

     }
 }