import java.util.Scanner;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String text = stdIn.nextLine();
		String[] textArray = text.split(" ");
		String appleIndex = "";
		String peachIndex = "";

		//textArrayの中で、.*apple.*と.*peach.*の格納されているインデックスを取得する
		for(int i = 0;i < textArray.length; i++){

			if(Pattern.compile(".*apple.*").matcher(textArray[i]).find()){
				appleIndex += i + " ";
			}else if(Pattern.compile(".*peach.*").matcher(textArray[i]).find()){
				peachIndex += i + " ";
			}
		}
		String[] appleIndexArray = appleIndex.split(" ");
		String[] peachIndexArray = peachIndex.split(" ");
		for(String i:appleIndexArray){
			if(i.equals(""))break;
			textArray[Integer.valueOf(i)] = textArray[Integer.valueOf(i)].replace("apple", "peach");
		}
		for(String i:peachIndexArray){
			if(i.equals(""))break;
			textArray[Integer.valueOf(i)] = textArray[Integer.valueOf(i)].replace("peach", "apple");
		}
		for(int i = 0;i < textArray.length; i++){
			if(i == textArray.length -1){
				System.out.println(textArray[i]);
			}else{
				System.out.print(textArray[i] + " ");
			}
		}
	}
}