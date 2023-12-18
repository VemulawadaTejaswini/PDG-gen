import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int k = sc.nextInt();
			
			int[] m = new int[n];
			for(int i=0;i<n;i++){
				m[i] = sc.nextInt();
			}
			
			ArrayDeque<String> que = new ArrayDeque<String>();
			StringBuffer sb;
			String s;
			
			for(int a=0;a<n;a++){
				for(int b=0;b<n;b++){
					if(a!=b){
						if(k==2){
							sb = new StringBuffer();
							s = sb.append(m[a]).append(m[b]).toString();
							if(que.contains(s)==false) que.add(s);
						}else{
							for(int c=0;c<n;c++){
								if(a!=c && b!=c){
									if(k==3){
										sb = new StringBuffer();
										s = sb.append(m[a]).append(m[b]).append(m[c]).toString();
										if(que.contains(s)==false) que.add(s);
									}else{
										for(int d=0;d<n;d++){
											if(a!=d && b!=d && c!=d){
												sb = new StringBuffer();
												s = sb.append(m[a]).append(m[b]).append(m[c]).append(m[d]).toString();
												if(que.contains(s)==false) que.add(s);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(que.size());
		}	
	}	
}