import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
		String str = sc.nextLine();
		String[] stra = str.split(" |,|\\.");
		for(int i = 0 ; i < stra.length ; i++){
				if(stra[i].length() >= 3 && stra[i].length() <= 6){
					output += stra[i];
					if(i != stra.length-1){
						output += " ";
					}
				}
		}
		System.out.print(output);
		System.out.println();
		sc.close();
	}

}