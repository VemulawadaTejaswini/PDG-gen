import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "";
		//while(sc.hasNext()){
		String str = sc.nextLine();
		String[] stra = str.split(" |,|\\.");
		for(int i = 0 ; i < stra.length ; i++){
				if(stra[i].length() >= 3 && stra[i].length() <= 6){
					output += stra[i] +" ";
				}
		}
		//}
		System.out.print(output);
		sc.close();
	}

}