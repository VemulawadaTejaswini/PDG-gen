import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data = new String[3];
		for(int i=0; i<3; i++){
			data[i] = sc.next();
		}
		for(int i=0; i<3; i++){
			System.out.print(data[i].charAt(i));
		}
	}
}