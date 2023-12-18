import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		Long ans = (long) 1;
		Long limit = (long) Math.pow(10,18);
      	boolean flag = false;

		for(int i=0; i<N; i++){
          	Long tmp = sc.nextLong();
          	if(tmp==0){
              flag = false;
              ans = (long) 0;
              break;
			}
          	if(flag){
              continue;
			}
			ans *= tmp;
          	if(ans>limit){
              flag = true;
			}
		}
		if(flag){
			System.out.println("-1");
			return;
		}
		System.out.println(ans);
		return;
	}
}