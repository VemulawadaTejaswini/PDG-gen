import java.util.*;
public class Main{
  	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
        int res = -1;
        if(sc.hasNext()){
        	int n = sc.nextInt();
            res = (1999 - n)/200 + 1;
            System.out.println(res);
        }                
    }
}