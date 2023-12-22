import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long N_min= 0;
		
			if (N<=K){
			N_min=Math.min(Math.abs(N-K),Math.abs(N));
			System.out.println(N_min);
			}
			else{
			N_min=Math.min(N%K,Math.abs((N%K)-K));
			System.out.println(N_min);
			}
		}
    }