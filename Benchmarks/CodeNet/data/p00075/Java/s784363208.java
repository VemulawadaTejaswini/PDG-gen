import java.util.*;

class Main{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		findans();
	}
	static void findans(){
		Main app=new Main();
		
		while(app.sc.hasNext()){
			String temp[]=app.sc.nextLine().split(",");
			double BMI=(Double.parseDouble(temp[1])/Math.pow(Double.parseDouble(temp[2]),2));
			if(BMI>=25){
				System.out.println(temp[0]);
			}
		}
	}
	
}