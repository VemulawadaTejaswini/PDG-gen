import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int s=sc.nextInt();
      int x,y,z,w;

        z=s%10;

        y=(s-z)%100/10;

        x=(s-10*y-z)%1000/100;

        w=(s-100*x-10*y-z)%10000/1000;

///////////////////////////////////////////////////////////
        if(w==x || x==y || y==z || (w==x&&x==y) || (x==y&&y==z) || (w==x&&x==y&&y==z)){
          System.out.println("Bad");
        }
        else{
          System.out.println("Good");
        }
///////////////////////////////////////////////////////////



    }
}
