import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> al = new ArrayList<>();
		
		double tmp;
		while(sc.hasNext()) {
			al.add(returnClass(sc.nextDouble()));
			
			for(String i : al) {
				System.out.println(i);
			}
		}
	}
	
	static String returnClass(double className) {
		if(className <= 48)			return "light fly";
		else if(className <= 51)	return "fly";
		else if(className <= 54)	return "bantam";
		else if(className <= 57)	return "feather";
		else if(className <= 60)	return "light";
		else if(className <= 64)	return "light welter";
		else if(className <= 69)	return "welter";
		else if(className <= 75)	return "light middle";
		else if(className <= 81)	return "middle";
		else if(className <= 91)	return "light heavy";
		else						return "heavy";
	}
}