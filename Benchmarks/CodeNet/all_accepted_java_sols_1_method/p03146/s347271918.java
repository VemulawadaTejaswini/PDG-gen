import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int endPoint = 10000;
    int[] ary = new int[endPoint];
    int s = sc.nextInt();
    ary[0] = s;
    for(int i=1; i<endPoint; i++) {
    	if(ary[i-1] %2 ==0) {
    		ary[i] = ary[i-1]/2;
    	}
    	else {
    		ary[i] = ary[i-1]*3+1;
    	}
    }
    int ans=0;
    for1:
    for(int m=2; m<endPoint; m++) {
        for(int n=0; n<m-1; n++) {
        	if(ary[n]==ary[m]) {
        		ans = m; break for1;
        	}
        }
    }
    System.out.println(ans+1);
  }
}