import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String S        = scanner.next();
		//上2桁を取得し数値に変換
		int front = Integer.parseInt(S.substring(0,2));
		//下2桁を取得し数値に変換
		int back  = Integer.parseInt(S.substring(2,4));
		
		//AMBIGUOUSの場合
		if((front != 0 && front <= 12) && (back != 0 && back <= 12)){
			
			System.out.println("AMBIGUOUS");
			
		//YYMMの場合
		}else if(back != 0 && back <= 12){
			
			System.out.println("YYMM");
			
		//MMYYの場合
		}else if(front != 0 && front <= 12){
			
			System.out.println("MMYY");
		//NAの場合
		}else{
			
			System.out.println("NA");
		}
	}
}
