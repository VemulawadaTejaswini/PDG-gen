import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int N_MAX = 500;
	public static final int M_MAX = 50;
	
	public static double inner_product(double[] in1, double[] in2){
		double sum = 0;
		
		for(int i = 0; i < in1.length; i++){
			sum += in1[i] * in2[i];
		}
		
		return sum;
	}
	
	public static double dist(double[] in){
		double ret = 0;
		for(double elem : in){
			ret += elem * elem;
		}
		
		return Math.sqrt(ret);
	}
	
	public static boolean check(double[] tele, double t_dist, double[] star, double rad){
		double[] small = new double[3];
		
		for(int i = 0; i < 3; i++){
			small[i] = tele[i] / t_dist;
		}
		
		double s_dist = 0;
		for(int i = 0; i < 3; i++){
			s_dist += (star[i] - small[i]) * (star[i] - small[i]);
		}
		s_dist = Math.sqrt(s_dist);
		
		double l_dist = Math.tan(t_dist);
		
		return l_dist >= s_dist;
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		double[][] stars = new double[N_MAX][3];
		double[][] teles = new double[M_MAX][3];
		double[] rads = new double[M_MAX];
		boolean[] counted = new boolean[N_MAX];
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			Arrays.fill(counted, false);
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 3; j++){
					stars[i][j] = sc.nextDouble();
				}
			}
			
			final int m = sc.nextInt();
			
			for(int i = 0; i < m; i++){
				for(int j = 0; j < 3; j++){
					teles[i][j] = sc.nextDouble();
				}
				
				rads[i] = sc.nextDouble();
			}
			
			int count = 0;
			for(int tele = 0; tele < m; tele++){
				final double t_len = dist(teles[tele]);
				
				for(int star = 0; star < n; star++){
					if(counted[star]){
						continue;
					}
					
					final double s_len = dist(stars[star]);
					
					final double inner = inner_product(teles[tele], stars[star]);
					
					final double rad = Math.abs(Math.acos(inner / (s_len * t_len)));
					
					//System.out.println(rad + " " + rads[tele]);
					
					if(rads[tele] > rad){
						counted[star] = true;
						count++;
					}
					
					//double l_dist = inner / s_len;
					
					//System.out.println(t_len + " " + l_dist);
					
					//if(0 > l_dist){
					//	continue;
					//}
					
					//if(check(teles[tele], l_dist, stars[star], rads[tele])){
					//	counted[star] = true;
					//	count++;
					//}
				}
			}
			
			System.out.println(count);
		}
	}

}