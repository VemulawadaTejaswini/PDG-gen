import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int k = 0; k < n; k++){
			String str = sc.next();
			str = str.replaceAll("-", "");
			String tr = str.substring(0, 1);
			int p, q, cur;
			p = q = cur = 0;
			for(int i = 1, l = str.length(); i < l; i++){
				String st = str.substring(i, i+1);
				if(st.equals(">")){
					cur++;
				} else if(st.equals("<")){
					cur--;
				} else {
					if(cur < p){
						tr = st + tr;
						p = cur;
					} else if(cur > q){
						tr = tr + st;
						q = cur;
					}
				}
			}
			System.out.println(tr);
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}