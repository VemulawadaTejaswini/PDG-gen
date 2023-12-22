import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase();
		char c[] = s.toCharArray();
		String tmp;
		int cnt=0;
		boolean bool;
		while(!(tmp=sc.next()).equals("END_OF_TEXT")){
			char line[]=tmp.toLowerCase().toCharArray();
			if(line.length!=c.length){
				continue;
			}
			bool = true;
			for(int i=0;i<s.length();i++){
				if(c[i]!=line[i]){
					bool=false;
					break;
				}
			}
			if(bool){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
