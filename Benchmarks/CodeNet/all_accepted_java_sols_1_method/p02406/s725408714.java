import java.util.*;

class Main{
	public static void main(String args[]){
		int num = 3;
		int x;
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		x = scan.nextInt();

		while(true){
			if(x < num){
				break;
			}
			if(num % 3 == 0 || Integer.toString(num).contains("3")){
				sb.append(" " + num);
			}
			num++;
		}
		System.out.println(sb);
	}
}