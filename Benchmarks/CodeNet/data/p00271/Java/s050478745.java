import java.io.*;
import java.util.*;

public class Main {
private void compute(){
	Scanner scanner = new Scanner(System.in);
	for(int i =0; i < 7 ; i++){
	   int nHigh = scanner.nextInt();
	   int nLow = scanner.nextInt();
	   System.out.println(nHigh - nLow);
	}
	
}
	public static void main(String[] args) {
		new Main().compute();
		
	}

}