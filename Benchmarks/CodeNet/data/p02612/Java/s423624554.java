import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      	int m = n/1000;
      	int p = (m+1)*1000-n;
      	
		System.out.print(p);
	}
}