import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] in = new String[2];
		double x=0,y=0;
		int theta=0;
		while(s.hasNext()){
			in = s.next().split(",");
			if(in[0].equals("0")&&in[1].equals("0"))
				break;
			int d = Integer.parseInt(in[0]);
			x += d*Math.sin(Math.toRadians(theta));
			y += d*Math.cos(Math.toRadians(theta));
			theta += Integer.parseInt(in[1]);			
		}		
		System.out.println((int) x);
		System.out.println((int) y);
    }
}