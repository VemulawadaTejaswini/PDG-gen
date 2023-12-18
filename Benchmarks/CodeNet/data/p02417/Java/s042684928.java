import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split("");
		String[] sabc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[] nabc = new int[sabc.length];
		for(int i=0; i<nabc.length; i++)nabc[i]=0;
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = strArray[i].toLowerCase();
			for(int j = 0; j < sabc.length; j++){
				if(strArray[i].equals(sabc[j])){
		    	nabc[j]++;
				}
			}
		}
		for(int j=0; j<sabc.length; j++){
			System.out.println(sabc[j] + " : " + nabc[j]);
		}
	}
}