import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String a= sc.nextLine();
		String[] al = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
				"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"} ;
        String[] array = a.split("");
        n = n%26;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 26; j++) {
            	if(array[i].equals(al[j])){
            		array[i] = al[j+n];
            		break;
            	}
            }
        }

        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i]);
        }

	}
}