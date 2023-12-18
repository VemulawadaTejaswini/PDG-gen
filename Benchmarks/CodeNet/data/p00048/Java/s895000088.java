import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double weight = scan.nextDouble();
			if(weight <= 48.0){
				System.out.println("light fly");
			}else if(weight > 48.0 && weight < 51.0){
				System.out.println("fly");
			}else if(weight >= 51.0 && weight < 54.0){
				System.out.println("bantam");
			}else if(weight >= 54.0 && weight < 57.0){
				System.out.println("feather");
			}else if(weight >= 57.0 && weight < 60.0){
				System.out.println("light");
			}else if(weight >= 60.0 && weight < 64.0){
				System.out.println("light welter");
			}else if(weight >= 64.0 && weight < 69.0){
				System.out.println("welter");
			}else if(weight >= 69.0 && weight < 75.0){
				System.out.println("light middle");
			}else if(weight >= 75.0 && weight < 81.0){
				System.out.println("middle");
			}else if(weight >= 81.0 && weight < 91.0){
				System.out.println("light heavy");
			}else if(weight >= 91.0){
				System.out.println("heavy");
			}
			
		}
		
 }
}