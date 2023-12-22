import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String PIN = sc.next();
		String[] PINs = PIN.split("");
		int[] li = new int[4];
		for(int count=0;count<4;count++){
			li[count] = Integer.parseInt(PINs[count]);
			if(count>0&&li[count]==li[count-1]){
				System.out.println("Bad");
				break;
			}else if(count==3){
				System.out.println("Good");
			}
		}
	}
}