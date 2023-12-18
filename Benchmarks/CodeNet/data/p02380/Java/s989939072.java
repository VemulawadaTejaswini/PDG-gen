import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b,c,S,L,h;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble()*(Math.PI/180);
        S=(a*b*Math.sin(c))/2;
        L=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c));
        h=b*Math.sin(c);
        System.out.printf("%f\n%f\n%f\n",S,L,h);
    }
}
