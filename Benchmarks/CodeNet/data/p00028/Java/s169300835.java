import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int [] i = new int[1000];
		for(;sc.hasNextInt();){
			i[sc.nextInt()]++;
		}
		int max = 0;
		for(int j = 0;j < 1000;j++){
			if(i[j] > max) max = i[j];
		}
		for(int j = 0;j < 1000;j++){
			if(i[j] == max) System.out.println(j);
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}