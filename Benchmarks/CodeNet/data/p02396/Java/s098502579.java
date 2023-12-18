
public class Main {
	 public static void main(String[] args) {
		 int i = 0;
		 while(true){
			 int x = new java.util.Scanner(System.in).nextInt();
			 if(x == 0){
				 break;
			 }
			 i++;
			 System.out.println("Case" + " " + i + ":" + " " + x);
		 }
	 }
}