
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int[] a = new int[m];
	    for (int i = 0; i < a.length; i++) {
			a[i] = n;
		}
	    
	    int[] b = new int[n];
	    for (int i = 0; i < b.length; i++) {
			b[i] = m;
		}
	    
	    if (n <= m) {
	    	for (int i : a) {
				System.out.print(i);
			}
	    } else {
	    	for (int i : b) {
				System.out.print(i);
			}
	    }
	    
	  }
	}