import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	String S = input.next();
      	String[] sDate = S.split("/");
      	int[] date = new int[3];
      	int i = 0;
        for ( String textValue : sDate ) {
          date[i] = Integer.parseInt( textValue ); 
          i++; 
        } 
      	String ans = "TBD";
      	if (date[0] < 2019) {
        	ans = "Heisei";
        } else if (date[0] == 2019) {
        	if (date[1] < 4) {
            	ans = "Heisei";
            } else if (date[1] == 4 && date[2] <= 30) {
            	ans = "Heisei";
            }
        }
      
      System.out.print(ans);

    }
}
