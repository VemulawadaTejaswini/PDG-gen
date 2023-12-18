import java.util.Arrays;
import java.util.Scanner;
        
        public class Main {
        	public static void main(String[] args) {
        		Scanner in = new Scanner(System.in);
        		int N = in.nextInt();
        		int K = in.nextInt();
        		int [] p = new int [N];
        		int total = 0;
        		
        		for(int i=0;i<N;i++) {
        			p[i] = in.nextInt();
        		}
        		
        		Arrays.sort(p);
        		
        		for(int i=0;i<K;i++) {
        			total+=p[i];
        		}
        		
        		System.out.println(total);
        		
        	}
        }