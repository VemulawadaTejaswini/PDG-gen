
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<String> results = new ArrayList<String>();
		
		try{
			int n = sc.nextInt();
			while(true){
				results.add(getSumWithInputs(n));
			}
		}catch(NoSuchElementException e){
			//do nothing
		}
		
		for(int i = 0; i < results.size(); i++){
			System.out.println(results.get(i));
		}
	}
	
	private static String getSumWithInputs(int n){
		String overflowMessage = "overflow";
		BigDecimal result = new BigDecimal("0");
		
		//ツ禿シツ療債値ツづーツ堕ォツつキ
		for(int i = 0; i < n; i++){
			String str = sc.next();
			result = result.add(new BigDecimal(str));
		}
		
		//ツ計ツ算ツ個仰嘉環づ個チツェツッツク
		String resultString = result.toString();
		if(isOver80(resultString)){
			return overflowMessage;
		}
		
		return resultString;
	}
	
	private static boolean isOver80(String str){
		if(str.length() >= 80){
			return true;
		}
		else{
			return false;
		}
	}
}