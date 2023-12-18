import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = 0;
		double w = 0;
		while(sc.hasNext()){
			String in = sc.nextLine();
			String[] ch = in.split(",");
			h = Double.parseDouble(ch[2]); 
			w = Double.parseDouble(ch[1]);
			if(w / h /h >=25)
				System.out.println(ch[0]);
				}
		}
	}