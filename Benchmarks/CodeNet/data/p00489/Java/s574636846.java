import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//???????????°
		int x = n*(n-1)/2;//????????°
		int p[] = new int [n+1];//??????????????????
		for(int i = 0; i<x;i++);
		int t1 =  sc.nextInt();
		int t2 =  sc.nextInt();
		int p1 =  sc.nextInt();
		int p2 =  sc.nextInt();
		if (p1<p2){
			p [t2] +=3;
		}else if(p1>p2){
			p [t1] +=3;
		}else{
			p[t1] +=1;
			p[t2] +=1;
		}	
		 int[] rank = new int[n];
	        for (int i = 0; i < p.length; i++) {
	            for (int j = 0; j < p.length; j++) {
	                if (p[i] < p [j]) {
	                    rank[i]++;
	                }
	            }
	        }
	        for(int i=0; i<n; i++){
			
						System.out.println(rank);
						
					}
				}
	        }
	