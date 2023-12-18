import java.util.Scanner;
 
public class Main{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a<=b&&b<=c){
        system.out.println("%d %d %d",a,b,c);
    }
    if(a<=c&&c<=b){
        system.out.println("%d %d %d",a,c,b);
    }
    if(b<=a&&a<=c){
        system.out.println("%d %d %d",b,a,c);
    }
    if(b<=c&&c<=a){
        system.out.println("%d %d %d",b,c,a);
    }
    if(c<=a&&a<=b){
        system.out.println("%d %d %d",c,a,b);
    }
    if(c<=b&&b<=a){
        system.out.println("%d %d %d",c,b,a);
    }
}