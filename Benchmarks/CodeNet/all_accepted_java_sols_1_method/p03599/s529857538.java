import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();
		double D = sc.nextInt();
		double E = sc.nextInt();
		double F = sc.nextInt();
		
		double water = 0;
		double suger = 0;
		double watmax = 0;
		double sugmax = 0;
		double maxnodo = 100 * E / (100 + E);
		double nodo = 0;
		double nodomax = 0;
	
		for(int a = 0; a <= F / 100; a += A) {
			for(int b = 0; b <= F / 100; b += B) {
				for(int c = 0; c <= F; c += C) {
					for(int d = 0; d <= F; d += D) {
						water = 100 * a + 100 * b;
						suger = c + d;
						if(water == 0 || water + suger > F) {
							break;
						}
						nodo = 100 * suger / (water + suger);
						if( nodo >= nodomax && nodo <= maxnodo) {
							watmax = water;
							sugmax = suger;
							nodomax = nodo;
						}
					}
				}
			}
		}
		System.out.println((int)watmax + (int)sugmax + " " + (int)sugmax);
	}
}
