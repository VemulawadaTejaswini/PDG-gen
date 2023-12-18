//package hw9;
import java.util.Scanner;

 class Profit{
	 private int n;
	 private int[] rateArray;
	 
	 public Profit() {
		 n = 0;
		 
	 }
	 
	 public void buildArray() {
		 Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 rateArray = new int[n];
		 for (int i = 0; i < n; i++)
			 rateArray[i] = in.nextInt();
		 in.close();
		 System.out.println(computeMaxProfit(n, rateArray));
		 
		 //for (int i = 0; i < n; i++)
			// System.out.println(rateArray[i]);
	 }
	 
	 public int computeMaxProfit(int n, int[] array) {
		 int maxProfit = -999999999;
		 /*for (int i = 0 ; i < n -1; i ++) {
			 for (int j = i + 1; j < n; j++) {
				 if (array[j] - array[i] > maxProfit) {
					 maxProfit = array[j] - array[i];
					 //System.out.println("Max Profit as of time " + i + " : " + maxProfit);
				 }
			 }
		 }*/
		 
		 int currentMax = array[1] - array[0];
		 int currentMin = array[0];
		 for (int i = 1; i < n; i++) {
			 if (array[i] - currentMin > currentMax) {
				 currentMax = array[i] - currentMin;
			 }
			 if (array[i] < currentMin) {
				 currentMin = array[i];
			 }
		 }
		 
		 
		 return currentMax;
	 }
 }

public class Main {
	public static void main(String[] args) {
		Profit p = new Profit();
		p.buildArray();
		
		
	}

}

