import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int sum = 0;
			String num = scan.next();
			if(num.equals("0")){
				scan.close();
				break;
			}
			char subnum[] = num.toCharArray();
			for(int i = 0; i < subnum.length; i++){
				sum += Character.getNumericValue(subnum[i]);
			}
			System.out.println(sum);
		}
	}
}