import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int A=input.nextInt();
        int B=input.nextInt();
        int H=input.nextInt();
        int M=input.nextInt();
        double angle=Math.abs(5.5*M-H*30)%360;
        double c=Math.sqrt(A*A+B*B-2*A*B*Math.cos(Math.PI*angle/180));
      System.out.print(c);
    }   
}