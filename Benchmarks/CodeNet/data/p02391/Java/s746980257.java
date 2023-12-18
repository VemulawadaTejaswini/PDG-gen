import java.util.Scanner;
public class Main_BranchonCondition_SmallLargeOrEqual {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		src.useDelimiter("?\?\s");
		int a = src.nextInt();
		int b = src.nextInt();
		
		
		if(a < b){
		System.out.println("a < b");
		}
		else if(a > b){
			System.out.println("a > b");
		}
		else if(a == b){
			System.out.println("a == b");
		}
	}

}