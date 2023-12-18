import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String result;
		int total;
		while(true){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if((m == -1) && (f == -1) && (r == -1)){
				break;
			}
			total = m + f;
			if ((m * f < 0)){
				result = "F";
			} else if (total >= 80){
				result = "A";
			} else if (total >= 65){
				result = "B";
			} else if (total >= 50){
				result = "C";
			} else if (total >= 30){
				if (r >= 50){
					result = "C";
				}
				else {
					result = "D";
				}
			} else {
				result = "F";
			}
			System.out.println(result);
		}
	}
}