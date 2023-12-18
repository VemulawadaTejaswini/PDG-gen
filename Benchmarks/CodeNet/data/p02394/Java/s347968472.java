import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean t = true;
		Scanner insert = new Scanner(System.in);
		String line = insert.nextLine();
		String array1[] = line.split(" ");
		int w = Integer.parseInt(array1[0]);
		int h = Integer.parseInt(array1[1]);
		int x = Integer.parseInt(array1[2]);
		int y = Integer.parseInt(array1[3]);
		int r = Integer.parseInt(array1[4]);
		insert.close();
		if((x+r) > w){
			t = false;
		}
		if((x - r) < 0) {
			t = false;
		}
		if((y+r) > h){
			t = false;
		}
		if((y - r) < 0) {
			t = false;
		}
		if(t) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}

