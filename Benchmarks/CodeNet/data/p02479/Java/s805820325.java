//¼a r Ì~ÌÊÏÆ~üÌ·³ðßévO
import java.util.*;
import java.lang.Math;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		//ÀÇÝÝ
		float r = sc.nextInt();
		System.out.printf("%f  %f\n",r*r*Math.PI ,r*2*Math.PI );
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}