import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int area = 0;
			int d = s.nextInt();
			for(int i=0 ; i<600 ;i+=d)
				area += i*i*d;
			System.out.println(area);
		}
    }
}