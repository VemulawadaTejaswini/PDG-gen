
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		ArrayList<String> listClass = new ArrayList<String>(0);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while((input = br.readLine()) != null){
			double weight = Double.parseDouble(input);
			listClass.add(getWeightClass(weight));
		}
		
		for(String str : listClass){
			System.out.println(str);
		}
	}
	
	public static String getWeightClass(double weight){
		if(weight > 91.0){
			return "heavy";
		}
		else if(weight > 81.0){
			return "light heavy";
		}
		else if(weight > 75.0){
			return "middle";
		}
		else if(weight > 69.0){
			return "light middle";
		}
		else if(weight > 64.0){
			return "welter";
		}
		else if(weight > 60.0){
			return "light welter";
		}
		else if(weight > 57.0){
			return "light";
		}
		else if(weight > 54.0){
			return "feather";
		}
		else if(weight > 51.0){
			return "bantam";
		}
		else if(weight > 48.0){
			return "fly";
		}
		else{
			return "light fly";
		}
	}
}