import java.util.Scanner;

/**
 * https://abc046.contest.atcoder.jp/tasks/arc062_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		
		int p = 0;
		int g = 0;
		int count = 0;
		for(int i=0; i<s.length; i++){
			switch(s[i]){
			case 'p':
				if(p<g){
					p++;
				}else{
					g++;
					count--;
				}
				break;
			case 'g':
				if(p<g){
					p++;
					count++;
				}else{
					g++;
				}
			}
		}
		
		System.out.println(count);

	}

}