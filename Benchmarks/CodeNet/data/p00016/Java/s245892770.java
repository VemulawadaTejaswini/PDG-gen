import java.util.*;
public class Main{
	
	public static String[] kommaReader(String sc) {
		String line = sc;
		String[] array = line.split(",");
		return array;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double theta=0;
		double x=0;
		double y=0;
		do{
			String[] a= kommaReader(sc.nextLine());
			double dest = Double.parseDouble(a[0]);
			double degr = Double.parseDouble(a[1]);
			if(dest==0 && degr==0) break;
			x += dest*Math.sin(theta*Math.PI/180);
			y += dest*Math.cos(theta*Math.PI/180);
			theta += degr;
		} while(sc.hasNext());
		
		System.out.println((int)x+"\n"+(int)y);

	}

}