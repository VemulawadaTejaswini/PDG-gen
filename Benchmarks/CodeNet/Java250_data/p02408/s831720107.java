import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();
		boolean[] isS = new boolean[13];
		boolean[] isH = new boolean[13];
		boolean[] isC = new boolean[13];
		boolean[] isD = new boolean[13];
		String strPic = "";
		for(int i = 0; i < intNum; i++){
			strPic = scan.next();
			if("S".equals(strPic)){
				isS[scan.nextInt()-1] = true;
			}else if("H".equals(strPic)){
				isH[scan.nextInt()-1] = true;
			}else if("C".equals(strPic)){
				isC[scan.nextInt()-1] = true;
			}else if("D".equals(strPic)){
				isD[scan.nextInt()-1] = true;
			}
		}
		for(int i = 0; i < 13; i++){
			if(!isS[i]){
				System.out.println("S " + (i + 1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(!isH[i]){
				System.out.println("H " + (i + 1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(!isC[i]){
				System.out.println("C " + (i + 1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(!isD[i]){
				System.out.println("D " + (i + 1));
			}
		}
		scan.close();
	}
}