import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		while(sc.hasNextLine()){
			String value = sc.nextLine();
			calc(value);
		}
	}
	public int calcnum(int num, int leng){
		if(num >= leng){
			return calcnum(num-leng, leng);
		}
		else return num;
	}
	public void calc(String line){
		String button1 = ".,!? ";
		String button2 = "abc";
		String button3 = "def";
		String button4 = "ghi";
		String button5 = "jkl";
		String button6 = "mno";
		String button7 = "pqrs";
		String button8 = "tuv";
		String button9 = "wxyz";
		
		String kekka = "";
		String button = "";
		int num = 0;
		for(int i = 0; i < line.length(); i++){
			char c = line.charAt(i);
			if(c=='0'){
				if(!button.equals("")){
					if(num >= button.length()){
						num = calcnum(num, button.length());
					}
					char k = button.charAt(num);
					kekka = kekka + String.valueOf(k);
				}
				button = "";
				num = 0;
			}
			else if(button.equals("")){
				if(c=='1'){
					button = button1;
				}
				else if(c=='2'){
					button = button2;
				}
				else if(c=='3'){
					button = button3;
				}
				else if(c=='4'){
					button = button4;
				}
				else if(c=='5'){
					button = button5;
				}
				else if(c=='6'){
					button = button6;
				}
				else if(c=='7'){
					button = button7;
				}
				else if(c=='8'){
					button = button8;
				}
				else if(c=='9'){
					button = button9;
				}
			}
			else{
				num = num + 1;
			}
		}
		System.out.println(kekka);
	}
	public static void main(String[] args){
		new Main().run();
	}
}