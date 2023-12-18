
import java.util.Scanner;
import java.util.*;

public class Main {
	public static int setCal(int d){
		int pos = 0;
		int i = d;
		while(i <600){
			pos+= i * i * d;
			i+=d;
		}
		return pos;
	}
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
		int output = setCal(scan.nextInt());
		System.out.println(output);
	}
	

	
}

}

