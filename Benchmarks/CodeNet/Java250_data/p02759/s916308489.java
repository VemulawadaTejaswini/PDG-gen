import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      int paper = 0;
      paper = n/2+n%2;
      System.out.println(paper);
	}
}