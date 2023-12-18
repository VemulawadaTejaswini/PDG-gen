import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int persons = sc.nextInt();
      int metro = sc.nextInt();
      int cab = sc.nextInt();
      if ((metro * persons) > cab){
      	System.out.println(cab);
      } else {
      	System.out.println(metro * persons);
      }
    }
}