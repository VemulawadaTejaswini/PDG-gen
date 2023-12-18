import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;){
		String str = sc.nextLine();
		// split??§????????????????´?
		String[] strArray = str.split("");
		 
		for (int i = 0; i < strArray.length; i++) {
			if(Character.isUpperCase(str.charAt(i))){
				//??§???????????¨???
				strArray[i] = strArray[i].toLowerCase();
			}else{
				strArray[i] = strArray[i].toUpperCase();
			}
		    System.out.print(strArray[i]);
		}
		}
	}
}