import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		while(true){
		    String line = sc.nextLine();
		    
		    if (line.equals("0")){
		        break;
		    }
		    
		    char []nums = line.toCharArray();
		    int total = 0;
		    
		    for (char c: nums){
		        total += Character.getNumericValue(c);
		    } 
		    
		    System.out.println(total);
		}
	}
}
