
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args)  {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner (System.in);
    int max = cin.nextInt();
    int mul = cin.nextInt();


    if (mul%2==0){
      int start = mul/2;
      int time = max/start;
      long res = 0;
      if (time%2==0){
        res = (long)Math.pow((time/2),3)*2;
      }
      else {
        res = (long)Math.pow(time/2+1,3)+(long)Math.pow(time/2,3);
      }
      if (res<=Integer.MAX_VALUE)
        System.out.println((int)res);
      else
        System.out.println(res);
    }

    else {
      int time = max / mul;
      long res = (long)Math.pow(time,3);

      if (res<=Integer.MAX_VALUE)
        System.out.println((int)res);
      else
        System.out.println(res);
    }

  }

}