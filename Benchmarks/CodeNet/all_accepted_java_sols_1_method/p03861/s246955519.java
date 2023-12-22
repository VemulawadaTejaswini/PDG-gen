import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      String str[] = line.split(" ");
      long a = Long.parseLong(str[0]);
      long b = Long.parseLong(str[1]);
      long x = Long.parseLong(str[2]);
      long count = 0;
      if(a%x==0){
        count = b/x -a/x+1;
      } else {
        count = b/x -a/x;
      }
      System.out.println(count);
	}
}