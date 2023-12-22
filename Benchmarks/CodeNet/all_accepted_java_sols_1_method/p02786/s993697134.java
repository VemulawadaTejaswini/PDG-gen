import java.util.Scanner;
import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            long h = scn.nextLong();
            long tekicount = 1;
            long total = h;
            while(true){
                if(h == 1){
                 tekicount = tekicount *2;
                    break;
                }
                h = h/2;
                tekicount = tekicount*2;
            }

            total = tekicount - 1 ;

            System.out.println(total);
        }
	}
	
}
