import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			int c = 0;
			int d = 0;
			int max = 0;
			
			if(a<35.5) c = 1;
			else if(a<37.5) c = 2;
			else if(a<40.0) c = 3;
			else if(a<43.0) c = 4;
			else if(a<50.0) c = 5;
			else if(a<55.0) c = 6;
			else if(a<70.0) c = 7;
			else c = 8;
			
			if(b<71.0) d = 1;
			else if(b<77.0) d = 2;
			else if(b<83.0) d = 3;
			else if(b<89.0) d = 4;
			else if(b<105.0) d = 5;
			else if(b<116.0) d = 6;
			else if(b<148.0) d = 7;
			else d = 8;
			
			max = Math.max(c, d);
			
			if(max==1) System.out.println("AAA");
			else if(max==2) System.out.println("AA");
			else if(max==3) System.out.println("A");
			else if(max==4) System.out.println("B");
			else if(max==5) System.out.println("C");
			else if(max==6) System.out.println("D");
			else if(max==7) System.out.println("E");
			else if(max==8) System.out.println("NA");
		}
	}	
}