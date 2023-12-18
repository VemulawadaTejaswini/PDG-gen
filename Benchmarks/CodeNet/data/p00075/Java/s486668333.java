import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while(s.hasNext()){
			String a = s.next();
			String[] b = a.split(",");
			int num = Integer.parseInt(b[0]); 
			double h = Double.parseDouble(b[2]); 
			double w = Double.parseDouble(b[1]); 
			if(w/h/h >= 25){
				System.out.println(num);
				flag = false;
			}
		}
		if (flag)
			System.out.println("ツ該ツ督鳴づ按つオ");
    }
}