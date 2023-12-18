import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String tmp = sc.next();
			int n = Integer.parseInt(tmp);
			if(n == 0) break;
			int sum = 0;
			char[] c = tmp.toCharArray();
			for(int i = 0; i < tmp.length(); i++){
				sum += c[i]-'0';
			}
			System.out.println(sum);
		}
	}
}