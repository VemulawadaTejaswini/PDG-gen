import java.util.*;
class Main{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
      int X = scan.nextInt();
      int T = scan.nextInt();
      int time = 0;
      if(N%X == 0) time = (N/X) * T;
      else time = ((N/X)+1)*T;
      System.out.println(time);
	}
}