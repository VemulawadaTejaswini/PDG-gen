import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			int[] d = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
				d[i] = sc.nextInt();
			}
			
			int[] s = new int[1001];
			int p;
			int count = 0;
			
			PriorityQueue<Integer> q = new PriorityQueue<Integer>();
			PriorityQueue<Integer> r = new PriorityQueue<Integer>();
			for(int i=10;i>=0;i--){
				for(int j=0;j<n;j++){
					if(c[j]==i && q.contains(d[j])==false) q.add(d[j]);
				}
				while(q.size()!=0){
					p = q.poll();
					for(int j=0;j<n;j++){
						if(c[j]==i && d[j]==p) r.add(a[j]);
					}
					while(r.size()!=0){
						p = r.poll();
						for(int j=0;j<n;j++){
							if(a[j]==p){
								if((count<10 && s[b[j]]<3) || (count<20 && s[b[j]]<2) || (count<26 && s[b[j]]==0)){
									System.out.println(p);
									count++;
									s[b[j]]++;
									break;
								}
							}
						}
					}
				}
								
			}
		}	
	}	
}