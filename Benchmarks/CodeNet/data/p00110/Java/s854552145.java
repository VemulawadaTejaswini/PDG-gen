import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String letter = sc.next();
			if(letter.equals("EOF")) break;
			String num1 = letter.substring(0,letter.indexOf("+"));
			String num2 = letter.substring(letter.indexOf("+") + 1, letter.indexOf("="));
			String sum = letter.substring(letter.indexOf("=") + 1,letter.length());
		
			int answer = getAnswer(num1,num2,sum);
			write(answer);
		}
	}
	
	public static int getAnswer(String number1,String number2,String sumNum){
		for(int i = 0;i <=9; i++){
			int num1 = createNumber(number1,i);
			int num2 = createNumber(number2,i);
			int sum = createNumber(sumNum,i);
			
			if(num1 + num2 == sum) return i;
		}
		return -1;
	}
	
	public static int createNumber(String num,int i){
		int returnValue = 0;	
		for(int j = 0; j < num.length(); j++){
			if(num.substring(j,j+1).indexOf("X") == -1){
				returnValue = returnValue * 10 + Integer.parseInt(num.substring(j,j+1));
			}else{
				returnValue = returnValue * 10 + i;
			}
		}
		return returnValue;
	}
	
	public static void write(int answer){
		if(answer == -1)System.out.println("NA");
		else System.out.println(answer);
	}
}