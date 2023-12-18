import java.util.*;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[][] button = {{'.',',','!','?',' '},
				{'a','b','c'},
				{'d','e','f'},
				{'g','h','i'},
				{'j','k','l'},
				{'m','n','o'},
				{'p','q','r','s'},
				{'t','u','v'},
				{'w','x','y','z'}
		};

		for(int i=0;i<N;i++){
			StringBuffer sb = new StringBuffer();
			String input = sc.next();
			for(int j=0;j<input.length();j++){
				//System.out.print("\n"+input.charAt(j));
				int now = Integer.parseInt(""+input.charAt(j));
				if(now!=0){
					int count = 0;
					for(;;){
						j++;
						if(Integer.parseInt(""+input.charAt(j))==0){
							break;
						}else{
							count++;
						}
					}
				sb.append(button[now-1][count % button[now-1].length]);
				}
			}
			System.out.println(sb);
		}
	}
}