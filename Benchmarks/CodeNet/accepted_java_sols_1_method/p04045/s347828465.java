import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[]D = new int[K];
			int n  = 0;
			Set<Integer>set = new TreeSet<Integer>();
			for(int i = 0;i<10;i++) {
				set.add(i);
			}
			for(int i = 0;i<K;i++) {
				D[i] =scan.nextInt();
				set.remove(D[i]);
			}
			
			int[]se = new int[set.size()];
			int i = 0;
			for(Integer e:set) {
				se[i] = e;
				i++;
			}
			
			//System.out.println(set.size());
			
			char o = (char)((set.size()+1)%10+'0');
			
			
			//０のないn進数探索を10進数で表現(０があると変わってくる。しかし少し変えるだけでいい)
			//2~9進数まで可能。
			long s = 1;
			//int count = 0;
			while(true) {	
				//count++;if(count>100)break;//この行はあとで消してもいい。
				
				//long s = k;
				int kurai = 0;
				while(s/(int)Math.pow(10, kurai)>0) {
					String p = String.valueOf(s);
					if(p.charAt(p.length()-1-kurai)==o) {//n進数なら'n+1'、９は０
						s+=(10-set.size())*(int)Math.pow(10, kurai);//n進数ならs+='10-n'*~;	
					}
					kurai++;
				}
				//k=s;
				String S = String.valueOf(s);
				StringBuffer sb = new StringBuffer();
				for(int j  = 0;j<S.length();j++) {
					int a = Integer.valueOf(S.substring(j, j+1));
					sb.append(se[a-1]);
				}
				String H = sb.toString();
				int co = 0;
				if(H.substring(0, 1).equals("0")) {
					co++;
					while(true) {
						if(co<H.length()&&H.substring(co, co+1).equals("0")) 
							co++;
						else
							break;
					}
				}
				H = H.substring(co, H.length());
				
				if(!H.isEmpty()) {
					int x = Integer.valueOf(H);
					if(N<=x) {
						System.out.println(x);
						System.exit(0);
					}
				}
				
				
				//System.out.print(H);
				
				//System.out.print(" ");
				//System.out.println(s);
				//k++;
				s++;
			}
			
			
			
		}
		
		
	}
	
	
	

}
