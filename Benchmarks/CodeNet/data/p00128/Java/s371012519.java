import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	char[][] abacus = {
			{'*','*','*','*','*',' ',' ',' ',' ',' '},
			{' ',' ',' ',' ',' ','*','*','*','*','*'},
			{'=','=','=','=','=','=','=','=','=','='},
			{' ','*','*','*','*',' ','*','*','*','*'},
			{'*',' ','*','*','*','*',' ','*','*','*'},
			{'*','*',' ','*','*','*','*',' ','*','*'},
			{'*','*','*',' ','*','*','*','*',' ','*'},
			{'*','*','*','*',' ','*','*','*','*',' '}
	};
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
			String str = scan.nextLine();
			int[] num = new int[5];
			for(int i = 5-str.length(),j = 0;j < str.length();i++,j++){
				num[i] = (int)(str.charAt(j) - '0');
			}
			for(int i = 0;i < 8;i++){
				for(int j = 0;j < 5;j++){
					System.out.print(abacus[i][num[j]]);
				}
				System.out.println();
			}
			if(!scan.hasNext()){
				break;
			}
			System.out.println();
		}
	}
}