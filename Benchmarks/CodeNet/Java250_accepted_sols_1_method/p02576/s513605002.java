import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String info[] = new String[3];
    info = line.split(" ", 0);
    int n = Integer.parseInt(info[0]);
    int x = Integer.parseInt(info[1]);
    int t = Integer.parseInt(info[2]);
    
    if(n % x == 0){
		System.out.println(n / x * t);
    }else{
      	System.out.println((n / x + 1)* t);
    }
  }
}