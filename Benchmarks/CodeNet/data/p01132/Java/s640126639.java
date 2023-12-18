import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		int n = sc.nextInt();
		if(n != 0) calc(n);
		while(n != 0 && sc.hasNext()){
			System.out.println();
			n = sc.nextInt();
			if(n == 0) break;
			calc(n);
		}
	}
	
	public void calc(int n){
		int ten = sc.nextInt();
		int ten5 = sc.nextInt();
		int hund = sc.nextInt();
		int hund5 = sc.nextInt();
		
		int sumMon = ten * 10 + ten5 * 50 + hund * 100 + hund5 * 500;
		int returnMon = sumMon - n;
		
		int retTen = 0;
		int retTen5= 0;
		int retHund = 0;
		int retHund5 = 0;
		
		while(returnMon >= 500){
			returnMon = returnMon - 500;
			retHund5++;
		}
		while(returnMon >= 100){
			returnMon = returnMon - 100;
			retHund++;
		}
		while(returnMon >= 50){
			returnMon = returnMon - 50;
			retTen5++;
		}
		while(returnMon >= 10){
			returnMon = returnMon - 10;
			retTen++;
		}
		
		if(retTen < ten) {
			System.out.print("10 ");
			System.out.println(ten-retTen);
		}
		if(retTen5 < ten5) {
			System.out.print("50 ");
			System.out.println(ten5-retTen5);
		}
		if(retHund < hund) {
			System.out.print("100 ");
			System.out.println(hund-retHund);
		}
		if(retHund5 < hund5) {
			System.out.print("500 ");
			System.out.println(hund5-retHund5);
		}
	}
	public void calc2(int n){
		int ten = sc.nextInt();
		int ten5 = sc.nextInt();
		int hund = sc.nextInt();
		int hund5 = sc.nextInt();
		
		int hantei = 0;
		for(int i100 = 0; i100 < 5; i100++){
			for(int i10 = 0; i10 < 5; i10++){
				if(kanou(n + i100 + i10, ten,ten5,hund,hund5, 0,0,0,0)) {
					hantei = 1;
					break;
				}
				else if(kanou(n + i100 + i10 + 50, ten,ten5,hund,hund5, 0,0,0,0)) {
					hantei = 1;
					break;
				}
			}
			if(hantei == 1) break;
		}
	}

	public boolean kanou(int n, int ten, int ten5, int hund, int hund5, int Oten, int Oten5, int Ohund, int Ohund5){
		if(n == 0) {
			if(Oten != 0) System.out.println("10 " + Oten);
			if(Oten5 != 0) System.out.println("50 " + Oten5);
			if(Ohund != 0) System.out.println("100 " + Ohund);
			if(Ohund5 != 0) System.out.println("500 " + Ohund5);
			return true;
		}
		else if(n >= 500 && hund5 > 0) return kanou(n-500, ten, ten5, hund, hund5 - 1, Oten, Oten5, Ohund, Ohund5+1);
		else if(n >= 100 && hund > 0) return kanou(n-100, ten, ten5, hund - 1, hund5, Oten, Oten5, Ohund+1, Ohund5);
		else if(n >= 50 && ten5 > 0) return kanou(n-50, ten, ten5 - 1, hund, hund5, Oten, Oten5+1, Ohund, Ohund5);
		else if(n >= 10 && ten > 0) return kanou(n-10, ten-1, ten5, hund, hund5, Oten+1, Oten5, Ohund, Ohund5);
		else return false;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}