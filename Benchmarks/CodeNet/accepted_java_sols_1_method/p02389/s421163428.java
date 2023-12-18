import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,area,length;
        a=sc.nextInt();
        b=sc.nextInt();
        area=a*b;
        length=2*a+2*b;
        System.out.println(area+" "+length);
    }
}
