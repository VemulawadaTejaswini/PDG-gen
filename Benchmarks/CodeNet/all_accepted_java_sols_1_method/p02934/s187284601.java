import java.util.Scanner;

public class Main{
	 public static void main(String[] args) {
		 float result=0;
	        Scanner scan = new Scanner(System.in);
	        float array[]=new float[scan.nextInt()];
	        for(int i=0;i<array.length;i++){
	        	array[i]=scan.nextInt();
	        	result=result+(1/array[i]);
	        }
	      System.out.print(1/result);
	    }
	}