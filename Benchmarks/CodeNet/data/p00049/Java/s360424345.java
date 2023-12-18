import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		int[] blood = new int[] {0, 0, 0, 0};	//A, B, AB, O
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner scstr = new Scanner(line);
			scstr.useDelimiter(","); scstr.next();
			
			String b = scstr.next(); scstr.close();
			if(b.equals("end")) break;
			if(b.equals("A")) blood[0]++;
			else if(b.equals("B")) blood[1]++;
			else if(b.equals("AB")) blood[2]++;
			else blood[3]++;
		}
		sc.close();
		for(int n: blood) System.out.println(n);
	}
}