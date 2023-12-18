
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0571().doIt();
	}
	
	
	class AOJ0571{
		void doIt(){
			char[] input = in.next().toCharArray();
			int result = 0;
			int n = input.length;
			for(int i=1;i<n;i++){//間にある文字を考える
				int cnt = 0;
				boolean sw = false;
				for(int s=0;s<n;s++){
					if(s+i>=n)break;
					if(s+i+i>=n)break;
//					if(input[s]=='J'&&input[s+i]=='O'&&input[i*2+s]=='I')System.out.println("***");
//					System.out.println(input[s]+" "+input[s+i]+" "+input[s+i*2]+" "+i+" "+s);
					if(input[s]=='J'&&input[s+i]=='O'&&input[i*2+s]=='I'){
						cnt++;sw = true;
					}else if(sw)break;
				}
				result = Math.max(result, cnt);
			}
			
			
			System.out.println(result);
		}
	}
	
}