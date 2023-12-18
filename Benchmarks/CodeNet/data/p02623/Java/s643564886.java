import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	long num1 = sc.nextLong();
      	long num2 = sc.nextLong();
      	long lim = sc.nextLong();
      	long ans = 0, tmp1 = 0, tmp2 = 0;
      
      	for(int i = 0; i < num1 ; i++){
          	tmp1 += sc.nextLong();
            ans += tmp1 <= lim ? 1 : 0;
      	}
      	for(int j = 0; j < num2 ; j++){
          	tmp2 += sc.nextLong();
          	ans += tmp2 <= lim ? 1 : 0;
        }
      System.out.println(ans);
    }
}