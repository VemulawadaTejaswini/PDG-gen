import java.util.Scanner; 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] Array = line.split(" ");
		int a = Integer.parseInt(Array[0]);
		int b = Integer.parseInt(Array[1]);
		int c = Integer.parseInt(Array[2]);
		if(a<b&&b<c&&a<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}