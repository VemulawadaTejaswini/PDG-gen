import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				float weight = sc.nextFloat();
				String WeightClass = check(weight);
				System.out.println(WeightClass);
			}
		}
		static String check(float a){
			if(a > 91 ){
				return "heavy";
			}else if(a>81){
				return"light heavy";
			}else if(a>75){
				return"middle";
			}else if(a>69){
				return"light middle";
			}else if(a>64){
				return"welter";
			}else if(a>60){
				return"light welter";
			}else if(a>57){
				return"light";
			}else if(a>54){
				return"feather";
			}else if(a>51){
				return"bantam";
			}else if(a>48){
				return"fly";
			}else{
			return "light fly";
		}
	}		
}