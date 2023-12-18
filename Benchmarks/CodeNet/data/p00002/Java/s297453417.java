import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int a,b,c, temp;
		while(reader.hasNextInt()){
		 a = reader.nextInt();
		 b = reader.nextInt();
		 c = a + b;
		 temp = c;
		 for(int i = 1; i <= 10; i++){
			 temp = temp / 10;
			 if(temp <= 0){
				 System.out.println(i);
				 break;
			 }
		 }
		}
	}
}