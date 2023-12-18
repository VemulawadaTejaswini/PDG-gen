//import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

class Main{
	public static void main(String[] args) {
try{
		//Scanner scan = new Scanner(new File("in.txt"));
		Scanner scan = new Scanner(System.in);


		int mesLength = scan.nextInt();
		ArrayList<String> arr = new ArrayList<>();

		for(int i = 0; i < mesLength; i++) {
			String _s = scan.next();
			if(_s.equals("insert")) {
				arr.add(scan.next());
			}else if(_s.equals("find")) {
				if(arr.contains(scan.next())) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}
		

}catch(Exception e) {
	e.printStackTrace();
}
	}
}