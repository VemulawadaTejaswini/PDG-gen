import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>(6);
		for(int i = 0; i < 6; i++){
			a.add(cin.nextInt());
		}
		for(int i = 0; i < a.size() - 1; i++){
			for(int j = 0; j < a.size() - 1; j++){
				if(Math.abs(a.get(i) - a.get(j)) > a.get(5)){
					System.out.println(":(");
					System.exit(0);
				}
			}
		}	
		System.out.println("Yay!");
	}
}