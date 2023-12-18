import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String tile = scan.next();
		String[] array = new String[tile.length()];
		int count = 0;

		for(int i=0;i<tile.length();i++) {
			array[i] = tile.substring(i,i+1);
		}

		for(int i=0;i<tile.length()-1;i++) {
			if(array[i].equals("0") && array[i+1].equals("0")) {
				array[i+1] = "1";
				count++;
			}else if(array[i].equals("1") && array[i+1].equals("1")) {
				array[i+1] = "0";
				count++;
			}
		}

		System.out.println(count);
		scan.close();
	}

}
