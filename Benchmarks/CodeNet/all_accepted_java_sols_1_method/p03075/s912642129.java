import java.util.*;
class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int min = sc.nextInt();
      sc.nextInt();sc.nextInt();sc.nextInt();
      int max = sc.nextInt();
      int limit = sc.nextInt();
      if(max-min<=limit)
        System.out.println("Yay!");
      else
        System.out.println(":(");
      return;
    }
}