import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] st = (sc.nextLine()).split(" ");
			double a = Double.parseDouble(st[0]);
			double b = Double.parseDouble(st[1]);
			int n = Integer.parseInt(st[2]);
			String str = Double.toString((a/b));
			str += "00000000";
			int s = 0;
			for(int i = 0; i < n; i++){
				String ssst = str.substring(i+2, i+3);
				s += Integer.parseInt(ssst);
			}
			System.out.println(Integer.toString(s));
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}