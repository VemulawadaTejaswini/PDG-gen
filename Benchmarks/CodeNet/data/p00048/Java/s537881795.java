import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		sc=new Scanner(System.in);
		for(; sc.hasNext();){
			double w=sc.nextDouble();
			if(w<=48.)
				println("light fly");
			else if(w<=51.)
				println("fly");
			else if(w<=54.)
				println("bantam");
			else if(w<=57.)
				println("feather");
			else if(w<=60.)
				println("light");
			else if(w<=64.)
				println("light welter");
			else if(w<=69.)
				println("welter");
			else if(w<=75.)
				println("light middle");
			else if(w<=81.)
				println("middle");
			else if(w<=91.)
				println("light heavy");
			else
				println("heavy");
		}
		sc.close();
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}