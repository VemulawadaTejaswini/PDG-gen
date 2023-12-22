import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] ss = str.split("/");
		
		if(Integer.parseInt(ss[0])<2019) {
			System.out.println("Heisei");
		}else if(Integer.parseInt(ss[0]) == 2019){
			if(Integer.parseInt(ss[1])<4) {
				System.out.println("Heisei");
			}else if(Integer.parseInt(ss[1])==4) {
				if(Integer.parseInt(ss[2])<30) {
					System.out.println("Heisei");
				}else if (Integer.parseInt(ss[2])==30) {
					System.out.println("Heisei");
				}else {
					System.out.println("TBD");
				}
			}else {
				System.out.println("TBD");
			}
		}else {
			System.out.println("TBD");
		}
	}
}
