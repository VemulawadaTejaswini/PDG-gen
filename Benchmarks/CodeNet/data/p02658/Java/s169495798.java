import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	Long seki = 1L;
        Long std = 1000000000000000000L / 1L;
      	do {
          seki = seki * sc.nextLong();
        } while(sc.hasNext());
      
        if (seki.compareTo(std) >= 0) {
            seki = -1L;
        }
        System.out.println(seki);
    }
}