import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int a =scan.nextInt();
    int b =scan.nextInt();
    int c =scan.nextInt();

    if(a>b && a>c){
        if(b>c){
            System.out.printf("%d %d %d\n",c,b,a);
        }else{
            System.out.printf("%d %d %d\n",b,c,a); 
        }
    }else if(b>a && b>c){
        if(a>c){
            System.out.printf("%d %d %d\n",c,a,b);
        }else{
            System.out.printf("%d %d %d\n",a,c,b); 
        }   
    }else if(c>a && c>b){
        if(a>b){
            System.out.printf("%d %d %d\n",b,a,c);
        }else{
            System.out.printf("%d %d %d\n",a,b,c); 
        }
    }
    }
}
