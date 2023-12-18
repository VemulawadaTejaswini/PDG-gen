import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main{
	static String []args;
	static Main app=new Main();
	static Scanner sc=new Scanner(System.in);
	List<Double> List=new ArrayList<Double>();
	void sol(double temp){
		List.add(temp);
	}
	
	void SystemOut(){
		Collections.sort(List);
		double ans=abs(List.get(0)-List.get(List.size()-1));
		System.out.println(ans);
	}

	public static void main(String[] args) {
		while(sc.hasNextDouble())app.sol(sc.nextDouble());
		app.SystemOut();
	}

}