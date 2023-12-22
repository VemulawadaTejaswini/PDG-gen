import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
      
        int sq = (int) Math.floor(Math.sqrt((double)N));
      	for(int i = sq; i > 0; i--){
          	if(N%i==0){
              if(i>(N/i)){
                System.out.println(String.valueOf(i).length());
                return;
              }else{
                Long ans = (long) (N/i);
                System.out.println(String.valueOf(ans).length());
                return;
              }
            }
        }
		System.out.println(String.valueOf(N).length());
	}
}
