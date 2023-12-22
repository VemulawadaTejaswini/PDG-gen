import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] dateParts = date.split("/");
		String dateStr = "";
		for(String part: dateParts){
			dateStr += part;
		}
		int date2Int = Integer.parseInt(dateStr);
		if(date2Int <= 20190430){
			System.out.println("Heisei");
		}else{
			System.out.println("TBD");
		}
		
	}


}