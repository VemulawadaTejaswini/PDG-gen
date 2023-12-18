import java.util.*;

class Main {
	public static void main(String[] args){
		
		int inputTime = newScanner(System.in);
		int h = inputTime / 3600;
		int amari = inputTime % 3600;
		int m = amari / 60;
		int s = amari % 60;
		
		System.out.println(h + ":" + m + ":" + s);
		
	}
}