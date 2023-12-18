import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
		}
      	int[] b = new int[n];
      	for(int i=a.length-1; i>=0; i-=2){
        	System.out.print(a[i]+ " ");
      }
       for(int i=a.length%2; i<a.length; i+=2){
        System.out.print(a[i]+ " ");
      }
	}
}