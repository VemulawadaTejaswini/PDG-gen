import java.util.*;


class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double d,t,s;
    d = 0; if(input.hasNextDouble())d = input.nextDouble();
    t = 0; if(input.hasNextDouble())t = input.nextDouble();
    s = 0; if(input.hasNextDouble())s = input.nextDouble();
    
    double speed = (double)d/t;
    //System.out.printf("%f %f\n",s,speed);
    if(speed<=s)System.out.println("Yes");
    else System.out.println("No");
    
    
    
    
    
  }
}