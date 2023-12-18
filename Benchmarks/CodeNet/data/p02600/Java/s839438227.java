import java.util.*;

public class Main{
  	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int start = 400;
      	int rank = 8;
      	while(true){
          if(n >= start && start + 199 >= n){
          	System.out.println(rank);
            break;
          }else{
           	start += 200;
            rank--;
          }
        }
    }
}