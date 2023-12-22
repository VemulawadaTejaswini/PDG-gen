import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		String[] strAry = str2.split(" ");
//		int int1 = Integer.parseInt(strAry[0]);
//		int int2 = Integer.valueOf(strAry[1]).intValue();
		
		int num = Integer.parseInt(str1);
		int minP = 1;
		int minPow=0;
		for(int i =1; i < 101; i++) {
			int pow = 0;
			for(int l =0; l < num; l++) {
				pow += Math.pow(Integer.parseInt(strAry[l])-i, 2);
			}
			if(i==1) {
			    minPow = pow;
			}else if(minPow>pow){
			    minPow = pow;
			    minP = i;
				
			}
		
		}
		System.out.println(minPow);



		
	
		
	}

}
