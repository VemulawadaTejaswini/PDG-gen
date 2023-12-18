public class Main {
public static void main(String[] args){
	
	int input = new java.util.Scanner ( System.in ). nextInt();
	int h = input / (60 * 60);
	int m = (input / 60) - (h * 60);
	int s = input - (m * 60) - (h * 60 * 60);
	System.out.println(h + ":" + m + ":" + s);
	
}
}