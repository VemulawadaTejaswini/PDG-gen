import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();   
      	long ans = 0;
      	for(int i=0;i<=n;i++){
          int t = n / i;
          long l = i * t * ( t+1 ) / 2;
          ans += l;
        }
      	System.out.println(ans);
	}
}