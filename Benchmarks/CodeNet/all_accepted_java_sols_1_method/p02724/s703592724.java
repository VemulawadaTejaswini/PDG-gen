import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int val = inputs.nextInt();
		int hap = 0;
		while(val>0) {
			val-=500;
			hap+=1000;
		}
		if(val!=0) {
			val+=500;
			hap-=1000;
		}
		while(val>0) {
			val-=5;
			hap+=5;
		}
		if(val<0) {
			val+=5;
			hap-=5;
		}
		System.out.println(hap);
	}

}
