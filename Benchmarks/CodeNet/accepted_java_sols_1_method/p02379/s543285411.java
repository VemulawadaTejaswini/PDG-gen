import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1,y1,x2,y2,dis;
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
  	    System.out.println(dis);
    }
}
