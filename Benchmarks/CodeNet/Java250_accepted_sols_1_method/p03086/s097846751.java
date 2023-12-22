import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char []t = s.toCharArray();
		int max = 0;
		int count = 0;
		for(int i = 0; i <s.length(); i++) {
			boolean p = true;
			p = (t[i] == 'A'||t[i] =='T'||t[i]=='C'||t[i]=='G');
				if(p) {
					count++;
					max = Math.max(max, count);
				}
				else{
					count =0;
				}
			}
		System.out.println(max);
	}

}
