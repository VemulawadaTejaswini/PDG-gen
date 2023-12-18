// package AOJ10006;  // packageÍÂ¯ÄÍ¢¯Ü¹ñ

import java.util.Scanner;


public class Main { // Class name Í Main Å·Bt@C¼àMain.java
	void run(){
		Scanner sc = new Scanner(System.in); // WüÍÍScannerªÖÅ·B
		
		for(int t = 1;;t++){
			int n = sc.nextInt(); // ScannerªÖÅ·B
			if(n == 0){ // I¹»è
				break;
			}

			System.out.println("Case "+t+": " + n);
		}
	}
	
	public static void main(String[] args){
		Main m = new Main();
		m.run(); // static method Í§ñª½¢ÌÅCX^X»µÄÊÌ\bhð§µÜ·
	}
}