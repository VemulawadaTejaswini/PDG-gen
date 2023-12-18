import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] stra = str.split("[, \\.]");
		for(int i = 0 ; i < stra.length ; i++){
			if(!("".equals(stra[i]))){
				if(stra[i].length() >= 3 && stra[i].length() <= 6){
					System.out.print(stra[i] +" ");
				}
			}
		}
		sc.close();
		
	}

}