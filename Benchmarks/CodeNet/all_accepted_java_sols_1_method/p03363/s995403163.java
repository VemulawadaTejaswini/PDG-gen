import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[]$) {
    Scanner s=new Scanner(System.in);
    long a[]=new long[s.nextInt()+1];
    System.out.println(IntStream.range(0,a.length).mapToObj(i->a[i]=(i==0?0:a[i-1]+s.nextInt())).collect(Collectors.groupingBy(i->i,Collectors.counting())).values().stream().mapToLong(i->i*(i-1)/2).sum());
  }
}