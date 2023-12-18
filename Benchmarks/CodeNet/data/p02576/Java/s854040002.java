import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
       	int t = sc.nextInt();
      	int ans = 0;
      	if( n % x != 0 ){
          ans = n / x;
          ans++;
        }else{
          ans = n / x;
        }
      System.out.println(ans*t);
      
	}
}