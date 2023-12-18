import java.util.Scanner;
public class Mai {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String moji = sc.nextLine();
			char[] n = moji.toCharArray();
			String temp = "";
			for(int j = 0; j < 26; j++){
				for(int i = 0; i < n.length; i++){
					if('a' <= n[i] && n[i] <= 'z')
						if(n[i] == 'z')
							n[i] = 'a';
						else
							n[i]++;
				}
				temp = String.valueOf(n);
				if(temp.contains("that") || temp.contains("this") || temp.contains("the")){
					System.out.println(temp);
					break;

				}
			}
		}
	}
}