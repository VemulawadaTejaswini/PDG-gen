import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int ans = 0;
      	for(int i=1;i<4;i++){
          ans += Math.pow(n,i);
        }
      System.out.println(ans);	
	}
}