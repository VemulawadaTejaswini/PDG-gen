import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      	Arrays.sort(a);
      	int sum = 0;
      	for(int i=0; i<a.length-1; ++i){
			sum = sum + a[i];
		}
      	if(sum<=a[a.length-1]){
          System.out.println("No");
        }else{
          System.out.println("Yes");
        }
      	
	}
}
