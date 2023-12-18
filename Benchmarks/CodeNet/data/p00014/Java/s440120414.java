import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int h = 0;
			int d = in.nextInt();
			for(int i=d; i<600; i=i+d){
				h = h+i*i;
			}
			System.out.println(h*d);
		}
	}
}