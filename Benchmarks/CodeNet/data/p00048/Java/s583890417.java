import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public String getClass(double w){
		if(w<=48)return "light fly";
		if(w<=51)return "fly";
		if(w<=54)return "bantam";
		if(w<=57)return "feather";
		if(w<=60)return "light";
		if(w<=64)return "light welter";
		if(w<=69)return "welter";
		if(w<=75)return "light middle";
		if(w<=81)return "middle";
		if(w<=91)return "light heavy";
		return "heavy";
	}

	public void run() {
		while(sc.hasNext()) {
			double w=sc.nextDouble();
			ln(getClass(w));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}