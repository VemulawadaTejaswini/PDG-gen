import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int countMaterial = Integer.parseInt(sc.nextLine());
    	String[] inputValue = sc.nextLine().split(" ");
    	
    	PriorityQueue<Double> Que = new PriorityQueue();
    	for(int i = 0;i<countMaterial;i++) {
    		double eachValue = Double.parseDouble(inputValue[i]);
    		Que.add(eachValue);
    	}
    	for(int i = 1;i<=countMaterial-1;i++) {
    		double tmp1 = Que.poll();
    		double tmp2 = Que.poll();
    		double tmp = (tmp1+tmp2)/2;
    		Que.add(tmp);
    	}
    	

    	
    	System.out.println(Que.peek());
    }
}