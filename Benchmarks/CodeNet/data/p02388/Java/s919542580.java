public class Main{

	public static void main(String[] args) {
		double line;
		double mass;
		line = Double.parseDouble(args[0]);
		mass=Math.pow(line, new Double(3));
		System.out.printf("%d",(int) mass);
	}

}
