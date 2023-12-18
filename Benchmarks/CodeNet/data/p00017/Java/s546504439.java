import java.util.Scanner;
public class Mai {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String moji = sc.nextLine();
			char[] narabi = moji.toCharArray();
			String temp = "";
			for(int j = 0; j < 26; j++){
				for(int i = 0; i < narabi.length; i++){
					if('a' <= narabi[i] && narabi[i] <= 'z')
						if(narabi[i] == 'z')
							narabi[i] = 'a';
						else
							narabi[i]++;
				}
				temp = String.valueOf(narabi);
				if(temp.contains("that") || temp.contains("this") || temp.contains("the")){
					System.out.println(temp);
					break;

				}
			}

		}

	}
}