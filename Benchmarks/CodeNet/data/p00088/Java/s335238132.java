import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String[][] code = { {"101","000000","000011","10010001","010001","000001","100101","10011010","0101","0001","110","01001","10011011","010000","0111","10011000","0110","00100","10011001","10011110","00101","111","10011111","1000","00110","00111","10011100","10011101","000010","10010010","10010011","10010000"} , {"11010","11110","11100","11101","11011","11111","00000","00001","00010","00011","00100","00101","00110","00111","010000","010001","01010","01011","01100","01101","01110","01111","10000","10001","10010","10011","10100","10101","10110","10111","11000","11001"} };
		char[] letter = {' ','\'',',','-','.','?','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		while(s.hasNext()){
		    String intemp = s.nextLine();
		    String encoded = "";
		    String decoded = "";
		    for(int i=0 ; i<intemp.length() ; i++){
			for(int j=0 ; j<32 ; j++){
			    if(letter[j] == intemp.charAt(i)){
			       encoded += code[0][j];
			       break;
			    }
			}
		    }
		    int a = encoded.length()%5;
		    if(a!=0){
			for(int i=0 ; i<5-a ; i++)
			    encoded += "0";
		    }
		    for(int i=0 ; i<encoded.length()/5 ; i++){
			char[] temp = new char[5];
			for(int j=0+i*5 ; j<5+i*5 ; j++)
			    temp[j-i*5] = encoded.charAt(j);
			String temp2 = String.valueOf(temp);
			for(int j=0 ; j<32 ; j++){
			    if(code[1][j].equals(temp2)){
				decoded += letter[j];
				break;
			    }
			}
		    }
		    System.out.println(decoded);
		}
      	}
}