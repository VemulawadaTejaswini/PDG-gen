import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
      
      	long yen = 100;
      	long count = 0;
      
      	while(yen < x){
          yen += Math.floor(yen * 0.01);
          count++;
        }
      	System.out.println(count);
	}
}