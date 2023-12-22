import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		String taro;
		String hanako;
		int taroWin = 0;
		int hanakoWin = 0;
		for(int kaisuu=0; kaisuu<n; kaisuu++){
			taro = scan.next();
			hanako = scan.next();
			taro = taro + "0";
			hanako = hanako + "0";
			char[] taroChar = taro.toCharArray();
			char[] hanakoChar = hanako.toCharArray();
			for(int i=0;i<taro.length() && i<hanako.length(); i++){
				//?????????????????????
				String charToString = String.valueOf(taroChar[i]);
				byte[] taroNumber = charToString.getBytes("US-ASCII");
				charToString = String.valueOf(hanakoChar[i]);
				byte[] hanakoNumber = charToString.getBytes("US-ASCII");
//				System.out.println(taroNumber[0]+" "+hanakoNumber[0]);
				if(taroNumber[0] > hanakoNumber[0]){
					taroWin += 2;
					hanakoWin -= 1;
					break;
				}
				else if(taroNumber[0] < hanakoNumber[0]){
					hanakoWin += 2;
					taroWin -= 1;
					break;
				}
			}
			taroWin += 1;
			hanakoWin += 1;
		}
		System.out.println(taroWin+" "+hanakoWin);
	}
}