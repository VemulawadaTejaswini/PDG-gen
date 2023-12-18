import java.util.Scanner;

public class Main { 
  public static void main(String[] args){
    int max = Integer.MIN_VALUE;
    int min = Integer.MIN_VALUE;
    int sum = 0;
    try (Scanner stdin = new Scanner(System.in)){
        int n = stdin.nextInt();
        for (int i=1; i<n=; i++){
	    int number = stdin.nextInt();	
	    if (number > max) {
		max = number;
	    } 
	    if (number < min) {
		min = number;
  	    }
	    sum += number;
        }     
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.printf("%d %d %d",min,max,sum);
  }
}