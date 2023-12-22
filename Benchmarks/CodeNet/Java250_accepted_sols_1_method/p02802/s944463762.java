import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int[] p = new int[m];
		boolean[] s = new boolean[m];
		boolean[] c = new boolean[n];
		int[] isum = new int[n];
		
		int penalty = 0;
		int gain = 0;
		
 		for(int i =0; i<m;i++) {
			p[i]= sc.nextInt();
			if(sc.next().equals("AC")) {
				s[i]=true;
			}else {
				s[i]=false;
			}
		}
 		for(int i =0; i<n;i++) {
			c[i]= false;
			isum[i] = 0;
		}
 		for(int i =0; i<m;i++) {
 			if(!c[p[i]-1]) {
 				if(s[i]) {
 					gain++;
 					c[p[i]-1]=true;
 				}else {
 					isum[p[i]-1]++;
 				}
 			}
		}
 		for(int i =0; i<n;i++) {
			if(c[i]) {
				penalty+=isum[i];
			}
		}
		System.out.println(gain+" "+penalty);
	}
	
}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
