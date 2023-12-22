import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double eps=0.000000000000000001;
		while(sc.hasNext()){
			double n=sc.nextDouble();
			double m=sc.nextDouble();
			if(n<35.5-eps && m<71.0-eps){
				System.out.println("AAA");
			}
			else if(n<37.5-eps && m<77.0-eps){
				System.out.println("AA");
			}
			else if(n<40.0-eps && m<83.0-eps){
				System.out.println("A");
			}
			else if(n<43.0-eps && m<89.0-eps){
				System.out.println("B");
			}
			else if(n<50.0-eps && m<105.0-eps){
				System.out.println("C");
			}
			else if(n<55.0-eps && m<116.0-eps){
				System.out.println("D");
			}
			else if(n<70.0-eps && m<148.0-eps){
				System.out.println("E");
			}
			else{
				System.out.println("NA");
			}
		}
	}

}