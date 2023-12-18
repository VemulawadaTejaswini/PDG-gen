import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		 Scanner scanner = new Scanner(System.in);
		   long N = scanner.nextLong();
		   Map<Long,Long> map_A = new HashMap<>();
      	   Map<Long,Long> map_B = new HashMap<>();

      		for(long i = 1; i < N+2; i++){
              long A = scanner.nextLong();
              map_A.put(i,A);
            }
      		for(long i = 1; i < N+1; i++){
              long B = scanner.nextLong();
              map_B.put(i,B);
            }

      		long ans = 0;
      		for(long i = 1; i < N+1; i++){
            ans += Math.min(map_A.get(i), map_B.get(i));
			long j = Math.max(0, map_B.get(i) -map_A.get(i));
			ans += Math.min(map_A.get(i+1), j);
            map_A.put(i+1,Math.max(0, map_A.get(i+1) - j));
            }
      System.out.println(ans);
	}

}
