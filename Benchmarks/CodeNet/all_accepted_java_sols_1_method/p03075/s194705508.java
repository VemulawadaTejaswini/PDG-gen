import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] points = new int[5];
    for(int i = 0; i < points.length; i++){
      points[i] = sc.nextInt();
    }
    int d = sc.nextInt();
    boolean check = true;
    for(int j = 0; j < points.length; j++){
      for(int k = 0; k < points.length; k++){
    	  if(j > k) {
    		  if((points[j] - points[k]) > d){
    			  check = false;
    		  }
    	  }else {
    		  if((points[k] - points[j]) > d){
    			  check = false;
    		  } 
    	  }
      }
    }
    if(check){
      System.out.println("Yay!");
    }else {
      System.out.println(":(");
    }
  }
}