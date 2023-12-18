import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next(); //元
		String T = sc.next(); //含まれる
		int cnt =0;
		int result = S.indexOf(T.substring(0,1));
			
		if(S.contains(T)) {
			System.out.println(0);
		}else if(result == -1){
			System.out.println(T.length()-1);
		}else{
			int i2 = 0;
			for(int i =	result; i<T.length()+result; i++) {
				if(S.substring(i,i+1).equals(T.substring(0+i2,1+i2))) {					
				}else {
					cnt = cnt+1;
				}
				i2=+1;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}