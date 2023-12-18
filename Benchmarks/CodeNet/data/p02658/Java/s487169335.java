import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	Long seki = sc.nextLong();
        Long std = 1000000000000000000L;
      	do {
          seki = seki * sc.nextLong();
          if(seki == 0) {
            System.out.println("0");
            return;
          }
        } while(sc.hasNext());
      
        if (seki.compareTo(std) > 0) {
            System.out.println("-1");
          	return;
        }
      
        System.out.println(seki);
    }
}