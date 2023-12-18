import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int dataSet = scanner.nextInt();
		List<String> result = new ArrayList<>();
		for(int i=0; i<dataSet; i++){
			int ab = (int)(Math.pow(scanner.nextInt(),2));
			int bc = (int)(Math.pow(scanner.nextInt(),2));
			int ac = (int)(Math.pow(scanner.nextInt(),2));
			String yes = "YES";
			String no = "NO";
			if(ab==bc+ac){
				result.add(yes);
			}else if(bc==ab+ac){
				result.add(yes);
			}else if(ac==ab+bc){
				result.add(yes);
			}
			result.add(no);
		}
		
		for(int j=0; j<dataSet;j++){
			System.out.println(result.get(j));
		}
		scanner.close();
		
	}	
}