import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      	double sum = 0;
      	for(int i=0; i<a.length; ++i){
			sum = sum + a[i];
		}
      	double ave = sum/n;
        double dif = ave;
      	double xxx = 0;
      	int ans = 0;
      	for(int i=0; i<a.length; ++i){
			xxx = Math.abs(ave-a[i]);
          	if(dif>xxx){
              dif=xxx;
              ans = i;
            }
		}
      System.out.println(ans);
	}
}
