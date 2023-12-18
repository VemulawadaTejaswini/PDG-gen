import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    ArrayList<Long> array = new ArrayList<Long>();
    array.add(a * c);
    array.add(a * d);
    array.add(b * c);
    array.add(b * d);
    long max = array.get(0);
    for(Long i : array){
      if(max < i){
        max = i;
      }
    }
    
    System.out.println(max);
    
  }
}