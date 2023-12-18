import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[] mesh = new char[9];
		while ((scan.hasNext())) {

			mesh = scan.nextLine().toCharArray();

			if(mesh[4] == mesh[3] && mesh[4] == mesh[5]){
				System.out.println(mesh[4]);
			}else if(mesh[4] == mesh[1] && mesh[4] == mesh[7]){
				System.out.println(mesh[4]);
			}else if(mesh[4] == mesh[2] && mesh[4] == mesh[6]){
				System.out.println(mesh[4]);
			}else if(mesh[4] == mesh[0] && mesh[4] == mesh[8]){
				System.out.println(mesh[4]);
			}else if(mesh[1] == mesh[0] && mesh[1] == mesh[2]){
				System.out.println(mesh[1]);
			}else if(mesh[7] == mesh[6] && mesh[7] == mesh[8]){
				System.out.println(mesh[7]);
			}else if(mesh[3] == mesh[0] && mesh[3] == mesh[6]){
				System.out.println(mesh[3]);
			}else if(mesh[5] == mesh[2] && mesh[5] == mesh[8]){
				System.out.println(mesh[5]);
			}else{
				System.out.println("d");
			}
		}
	}
}