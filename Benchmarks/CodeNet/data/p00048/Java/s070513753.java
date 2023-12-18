import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(sc.hasNextInt()){
			double kg = sc.nextDouble();
			if(48.00 >= kg)list.add("light fly");
			if(48.00 < kg && 51.00 >= kg)list.add("fly");
			if(51.00 < kg && 54.00 >= kg)list.add("bantam");
			if(54.00 < kg && 57.00 >= kg)list.add("feather");
			if(57.00 < kg && 60.00 >= kg)list.add("light");
			if(60.00 < kg && 64.00 >= kg)list.add("light welter");
			if(64.00 < kg && 69.00 >= kg)list.add("welter");
			if(69.00 < kg && 75.00 >= kg)list.add("light middle");
			if(75.00 < kg && 81.00 >= kg)list.add("middle");
			if(81.00 < kg && 91.00 >= kg)list.add("light heavy");
			if(91.00 < kg)list.add("heavy");
		}
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}