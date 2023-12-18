import java.util.Scanner;

public class Main {
	static int list[] = new int[26];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{
			while(scan.hasNext()){
				String str = scan.nextLine();
				char ch[] = str.toCharArray();
				for(int i = 0; i < ch.length; i++){
					/*if(ch[i] == '.'){
						scan.close();
					}*/
					CountingCharacters(ch[i]);
				}
			}
		}catch(IllegalStateException e){
			/*char alp = 97;
			for(int i = 0; i < list.length; i++){
				alp = Character.valueOf((char) (97 + i));
				System.out.println(alp + " : " + list[i]);
			}*/
		}
		scan.close();
		char alp = 97;
		for(int i = 0; i < list.length; i++){
			alp = Character.valueOf((char) (97 + i));
			System.out.println(alp + " : " + list[i]);
		}
	}

	public static void CountingCharacters(char Ch){
		Ch = Character.toLowerCase(Ch);
		char alp = 97;
		for(int i = 0; i < list.length; i++){
			//a to z = 97 to 122
			if(Ch == alp + i){
				list[i]++;
			}
		}
	}
}