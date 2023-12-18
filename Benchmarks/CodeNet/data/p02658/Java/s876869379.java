import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		long mult = 1;
		long  num = 1000000;
		for(int i=0 ; i<n ; i++) {
			mult = mult*arr[i];
		}
		
		if(mult < 0)
		{
			System.out.println(-1);
		}
		else
			System.out.println(mult);
  }
}