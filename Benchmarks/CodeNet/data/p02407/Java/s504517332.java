import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String line = scan.nextLine();
		String[] Array = line.split(" ");
		for(int i = Array.length-1; i<0; i--){
			if(i==Array.length-1){
				System.out.print(Array[i]);
			}else{
				System.out.print(" "+Array[i]);
			}

		}
	}
}