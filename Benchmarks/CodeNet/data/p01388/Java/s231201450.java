import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int[] ch = new int[4];
			String str = scan.nextLine();
			for(int i = 0;i < str.length();i++){
				switch(str.charAt(i)){
				case 'K':
					ch[0]++;
					break;
				case 'U':
					ch[1]++;
					break;
				case 'P':
					ch[2]++;
					break;
				case 'C':
					ch[3]++;
					break;
					default:
						break;
				}
			}
			Arrays.sort(ch);
			System.out.println(ch[0]);
		}
	}
}