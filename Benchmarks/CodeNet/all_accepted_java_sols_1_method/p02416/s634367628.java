import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String x;
		Scanner scan = new Scanner(System.in);
		while(true){
			x=scan.next();
			if(x.equals("0")){
				scan.close();
				break;
			}
			char[] c = x.toCharArray();
			int sum=0;
			for(int i=0;i<c.length;i++){
				sum+=(c[i]-48);
			}
			System.out.println(sum);
		}
	}
}
