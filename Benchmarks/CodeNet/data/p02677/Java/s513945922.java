import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int A=in.nextInt();
    int B=in.nextInt();
    int H=in.nextInt();
    int M=in.nextInt();
    
    double t=(2*3.141592654*H)/12+(2*3.141592654*M)/(12*60);
    
    double t1=(2*3.141592654*M)/60;
    
    double p=Math.abs(t-t1);
    double y=Math.cos(p);
    double k=((y*2*A*B)-(A*A)-(B*B))*-1;
    double h=Math.sqrt(k);
    System.out.println(h);
  }
}
  


    
    
    
