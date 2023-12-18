import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] data = str.toCharArray();
		for(int i = 0 ; i < data.length;i++){
			if(Character.isUpperCase(data[i]))
				data[i] = Character.toLowerCase(data[i]);
			else if(Character.isLowerCase(data[i]))
				data[i] =Character.toUpperCase(data[i]);
			System.out.printf("%c", data[i]);
		}
		System.out.println();
		scan.close();
	}
}