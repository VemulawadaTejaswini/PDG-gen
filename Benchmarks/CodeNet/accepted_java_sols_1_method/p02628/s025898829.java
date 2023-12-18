
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Vector <Integer> precios=new Vector<Integer>();
		short n=input.nextShort();
		int k=input.nextInt();
		for(int i=0;i<n;i++) {
			precios.add(input.nextInt());
		}
		Collections.sort(precios);
		int suma=0;
		for (int j=0;j<k;j++) {
			suma+=precios.get(j);
		}
		System.out.println(suma);
	}

}
