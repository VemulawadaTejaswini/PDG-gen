import java.util.Scanner;

public class Main {
   public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  while(sc.hasNext()){
		  String line = sc.nextLine();
		  String[] datas = line.split(",");
		  double weight = Double.parseDouble(datas[1]);
		  double height = Double.parseDouble(datas[2]);
		  double bmi = weight/(height*height);
		  if(bmi >= 25.0){
			  System.out.println(datas[0]);
		  }
	   }
     }
}