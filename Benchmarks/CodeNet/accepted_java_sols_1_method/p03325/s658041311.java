import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long[] a = new long[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      	int count = 0;
      	for(int i=0; i<a.length; ++i){
			for(int j=0; j<1000; j++){
              if(a[i]%2==1) break;
              a[i]=a[i]/2;
              count++;
            }
		}
      	System.out.println(count);
	}
}
