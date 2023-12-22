import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		String fRep = first + first;
		String second = scan.nextLine();
		boolean flg = false;

		for(int i = 0; i < fRep.length() - second.length(); i++){
			String subF = fRep.substring(i, i + second.length());
			if(subF.equals(second)){
				flg = true;
				break;
			}
		}
		System.out.println((flg)? "Yes" : "No");
	}
}