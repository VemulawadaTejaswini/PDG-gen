import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc = new Scanner(System.in);
		String str;

		while(true){
			str = sc.nextLine();
			if(str.equals("END OF INPUT")){
				break;
			}

			int count = 0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i) == ' '){
					System.out.print(count);
					count = 0;
				}else{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}