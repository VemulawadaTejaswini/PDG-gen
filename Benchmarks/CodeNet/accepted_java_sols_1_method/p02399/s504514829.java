import java.util.*;
class Main{
public static void main(String[] args){
    int a,b,d,r;
    Scanner scan=new Scanner(System.in);
    a=scan.nextInt();
    b=scan.nextInt();
    d=a/b;
    r=a%b;
    double f = (double) a / (double) b; 
    System.out.printf("%d %d %.5f\n",d,r,f);
    }
}
