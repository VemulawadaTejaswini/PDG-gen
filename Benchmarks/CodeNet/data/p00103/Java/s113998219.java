import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int base=0;
			int cnt = 0, out=0;
			while(out<3){
				String res = in.next();
				if(res.equals("HIT")){
					if((base & (1<<2)) > 0){
						cnt++;
						base &= ~(1<<2);
					}
					base <<= 1;
					base |= 1;
				}
				else if(res.equals("HOMERUN")){
					cnt += 1 + Integer.bitCount(base);
					base = 0;
				}
				else{
					out++;
				}
			}
			System.out.println(cnt);
		}
	}
}