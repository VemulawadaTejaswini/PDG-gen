import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 while(true){
			 String x=sc.nextLine();
			 if(x.equals("0"))break;
			 int sum=0;
			 for (char y:x.toCharArray()) {
				 sum +=Integer.parseInt(String.valueOf(y));
			 }

		 System.out.println(sum);
		 }
		 sc.close();
	 }
}

