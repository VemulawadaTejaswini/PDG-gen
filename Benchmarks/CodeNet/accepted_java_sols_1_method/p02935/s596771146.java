import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    ArrayList<Double> list= new ArrayList<>();
    for(int i = 0; i < n; i++)
      list.add(sc.nextDouble());
    
    while(list.size() > 2){
    	Collections.sort(list);
      	double a = (list.get(0) + list.get(1))/2.0;
      	list.remove(0);
      	list.remove(0);
      	list.add(a);
    }
    System.out.println((list.get(0) + list.get(1))/2.0);
  }
}