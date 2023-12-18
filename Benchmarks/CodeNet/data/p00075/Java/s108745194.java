import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList l = new ArrayList();
		while(sc.hasNext()){
			double w = Double.parseDouble(s[1]);
			double h = Double.parseDouble(s[2]);
			if(w/(h*h)>=25)l.add(Integer.parseInt(s[0]));
		}
		if(l.isEmpty())System.out.println("該当なし");
		else for(Integer i:l)System.out.println(i);
	}
}