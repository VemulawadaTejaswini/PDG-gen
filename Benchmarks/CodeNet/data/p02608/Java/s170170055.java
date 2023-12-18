import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int[] count = new int[N+1];
	for(int x = 1; x <= 100; x++){
		for(int y = 1; y <= 100; y++){
			for(int z = 1; z <= 100; z++){
				if(x*x+y*y+z*z+x*y+y*z+z*x>N) break;
				count[x*x+y*y+z*z+x*y+y*z+z*x]++;
			}
		}
	}
	for(int x = 1; x <= N; x++){
		System.out.println(count[x]);
	}

    
  }
}