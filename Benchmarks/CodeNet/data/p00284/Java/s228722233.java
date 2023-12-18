import java.util.*;
public class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int g = sc.nextInt();
			if(s > g) {
				int tmp = s;
				s = g;
				g = tmp;
			}
			
			if(s == 0) {
				int count = 0;
				if(g % 2 == 1) {
					g--;
					count++;
				}
				
				for(int j = 32; j >= 0; j--) {
					while(g / (int)Math.pow(2, j) > 0) {
						g -= (int)Math.pow(2, j);
						count++;
					}
				}
				System.out.println(count);
				
			}
			else if(g == 0) {
				int count = 0;
				if(s % 2 == 1) {
					s++;
					count++;
				}
				
				for(int j = 32; j >= 0; j--) {
					while(s / (int)Math.pow(2, j) < 0) {
						s += (int)Math.pow(2, j);
						count++;
					}
				}
				System.out.println(count);
			}
			else if(s >= 0 && g >= 0) {
				int count = 0;
				if(s % 2 == 1) {
					s++;
					count++;
				}
				if(g % 2 == 1) {
					g--;
					count++;
				}
				CON:while(s != g)
				for(int j = 32; j >= 0; j--) {
					while(s % (int)Math.pow(2, j) == 0 && s + (int)Math.pow(2,j) <= g) {
						s += (int)Math.pow(2, j);
						count++;
						continue CON;
					}
				}
				System.out.println(count);
			}
			else if(s <= 0 && g <= 0) {
				int count = 0;
				if(s % 2 == 1) {
					s++;
					count++;
				}
				if(g % 2 == 1) {
					g--;
					count++;
				}
				CON:while(s != g){
					for(int j = 32; j >= 0; j--) {
						while(s % (int)Math.pow(2, j) == 0 && s + (int)Math.pow(2,j) <= g) {
							s += (int)Math.pow(2, j);
							count++;
							continue CON;
						}
					}
				}
				System.out.println(count);
			}
			else {
				int count = 0;
				if(g % 2 == 1) {
					g--;
					count++;
				}
				
				for(int j = 32; j >= 0; j--) {
					while(g / (int)Math.pow(2, j) > 0) {
						g -= (int)Math.pow(2, j);
						count++;
					}
				}
				if(s % 2 == 1) {
					s++;
					count++;
				}
				
				for(int j = 32; j >= 0; j--) {
					while(s / (int)Math.pow(2, j) < 0) {
						s += (int)Math.pow(2, j);
						count++;
					}
				}
				System.out.println(count);
			}
			
			
			
		}
	}
}