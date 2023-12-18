import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    int ans = 0;
    for(int i=1; i<=x; i++) {
    	for(int j=2; j<=x; j++) {
    		if((int)Math.pow(i, j) <= x) {
    			if((int)Math.pow(i, j) > ans){
    			ans = (int)Math.pow(i, j);
    		}
    	}
    }
    }
    if(x == 1){
    	System.out.println("1");
    }else{
    	System.out.println(ans);
      }
}
}