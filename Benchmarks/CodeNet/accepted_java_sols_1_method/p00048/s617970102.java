import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] classlist = {"heavy", "light heavy", "middle", "light middle", "welter",
						  "light welter", "light", "feather", "bantam", "fly",
						  "light fly"};
		double[] weightlist = {91,81,75,69,64,60,57,54,51,48,0};
		double weight;
		
		while (sc.hasNextDouble()) {
			weight = sc.nextDouble();
			for(int i = 0;;i++){
				if(weightlist[i] < weight){
					System.out.println(classlist[i]);
					break;
				}
			}
		}
	}
}