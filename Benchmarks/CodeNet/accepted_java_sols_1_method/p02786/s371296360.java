import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//　敵の体力
		long h = sc.nextLong();
      
      	for(int i=0;h>=Math.pow(2,i);i++){
          if(h<Math.pow(2,i+1)){
		    System.out.println((long)Math.pow(2,i+1)-1);
          }
		}
     }
}
