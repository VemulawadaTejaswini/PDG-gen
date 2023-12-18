import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			int n = sc.nextInt();
			int s = 0;
a/=b;
			String str = Double.toString(a);
str += "0000000000";
			for(int i = 0; i < n; i++){
				s += Integer.parseInt((str.substring(i+2, i+3)));
			}
			System.out.println(Integer.toString(s));
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}