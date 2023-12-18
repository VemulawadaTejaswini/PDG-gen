import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] strAry = str.split(" ");
		int int1 = Integer.parseInt(strAry[0]);
		int int2 = Integer.valueOf(strAry[1]).intValue();
		
		int i = 0;
		boolean b = true;
		while(b) {
			if(int1 <Math.pow(int2, i)){
				System.out.println(i);
				b = false;
			}
			i++;
		scan.close();
		}
		
	
		
	}

}
