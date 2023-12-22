import java.util.*;
import java.lang.Double;

public class Main {

    public static void main(String[] args) {
      Scanner reader=new Scanner(System.in);
       long x=reader.nextLong();
       long yokin=100;
       int year=0;
      while(yokin<x)
      {
        year++;

        yokin=(long)(yokin+(long)yokin*0.01);

      }
      System.out.println(year);
}




}
