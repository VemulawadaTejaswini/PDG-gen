import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      
      	for (int i = 1; i < 10; i++) {
        	for (int j = 1; j < 10; j++) {
            	if (i * j == n) { System.out.println("Yes"); return; }
            }
        }
      
      	System.out.println("No");
    }
}
