import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < s.length();i++){
			if(i%2==0){
				sb.append(c[i]);
			}
		}

		System.out.println(sb.toString());
	}
}
