import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str;
		int s;
		double w, h;
		
		while(scan.hasNext()){
			str = scan.next();
			String[] num = str.split(",", 0);
			
			s = Integer.parseInt(num[0]);
			w = Double.parseDouble(num[1]);
			h = Double.parseDouble(num[2]);
			
			if((w / (h*h)) >= 25)System.out.println(s);
		}
	}
}