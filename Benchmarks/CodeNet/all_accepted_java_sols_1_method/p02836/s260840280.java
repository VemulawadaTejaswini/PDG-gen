//import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char[] a = scn.next().toCharArray();
        int n = a.length;
        int hug = 0;
        int limit = n/2 ;
        for(int i = 0; i < n; i++) {
          
			if ( i >= limit ){
				break;
			}
			if(a[i] != a[n-i-1]){
				//i = 0;
				//a[n-i-1] = a[i];
				hug = hug + 1;
			}
          
        }

		 System.out.println(Integer.toString(hug));

    }
}