import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	String[] list = new String[n];
      	for(int i = 0; i < n; i ++){
        	String restaurant = sc.next();
          	int score = sc.nextInt();
          	list[i] = restaurant + "_" + (200 - score) + "_" + (i + 1);
        }
      	Arrays.sort(list);
      	for(String s : list){
        	String ans = s.split("_")[2];
          	System.out.println(ans);
        }
    }
}