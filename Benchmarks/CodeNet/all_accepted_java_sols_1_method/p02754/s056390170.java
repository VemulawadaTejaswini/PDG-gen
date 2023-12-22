import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String strFront = sc.next();
    String strBlue = sc.next();
    String strRed = sc.next();
    long Front = Long.parseLong(strFront);
    long Blue = Long.parseLong(strBlue);
    long Red = Long.parseLong(strRed);
    
    if(Blue == 0) {
    	System.out.println(0);
    	return;
    }
    long cycle = Front / (Blue + Red);
    long remainder = Front % (Blue + Red);
    if(remainder > Blue) {
    	remainder = Blue;
    }
    
    System.out.println(cycle * Blue + remainder);

}
}