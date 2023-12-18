import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		//if(a > 10) System.out.println(0);
		long ten = 1;
      	long nine = 1;
      	long eight = 1;
      	long m = 1000000007;
	    for(int i = 0; i < n; i++) {
          ten = (ten*10) % m;
          nine = (nine*9) % m;
          eight = (eight*8) % m;
        }
          
		System.out.println((int) ( ((ten + eight)%m  - (2*nine)%m)%m)); 
	}
}