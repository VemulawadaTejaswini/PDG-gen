import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new aoj506().doIt();
	}
	class aoj506{
		StringBuilder cnt(char ctr[],int length){
			StringBuilder result = new StringBuilder();
			int count = 1;
			char num = ctr[0];
			for(int i = 1;i < length;i++){
				if(num == ctr[i])count++;
				else {
					result.append(count);
					count = 1;
					result.append(num);
					num = ctr[i];
				}
			}
			result.append(count);
			result.append(num);
			return result;
		}
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				String m = sc.next();
				StringBuilder sb = new StringBuilder();
				sb.append(m);
				for(int i = 0;i < n;i++){
					char ctr[] = new char[sb.length()];//????????????????????????
					sb.getChars(0, ctr.length, ctr, 0);
					sb = cnt(ctr,ctr.length);
				}
				System.out.println(sb);
			}
		}
	}
}