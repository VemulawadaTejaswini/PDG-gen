import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	if(a<=8 && b<=8){
          System.out.println("Yay!");
        }else{
          System.out.println(":(");
        }
	}
}