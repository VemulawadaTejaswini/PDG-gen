import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = 5;
		int[] a = new int[n];
      	int num=0;
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
          	if(a[i]==0) num=i+1;
		}
      	System.out.println(num);
	}
}