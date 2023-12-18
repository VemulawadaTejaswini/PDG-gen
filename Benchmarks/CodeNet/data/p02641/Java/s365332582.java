import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x  =sc.nextInt();
    int n = sc.nextInt();
    int [] a = new int[n];
    int abs = 100;
    int ans = 0;
    for(int i = 0; i < n; i++) {
    	a[i] = sc.nextInt();
    }
    int[] b = new int[200];
    for(int i = 0; i < 200; i++) {
    	b[i] = i - 100;
    	for(int j = 0; j < n; j++) {
    		if(a[j] == b[i]) {
              b[i] = 1000;
            }
    	}
    }
    for(int i = 0 ; i < 200; i++) {
    	if(Math.abs(x-b[i]) < abs) {
          	abs = Math.abs(x-b[i]);
    		ans = b[i];
    	}
    }
    if(n==0) {
      ans = x;
    }
    System.out.println(ans);
    sc.close();
  }
}
