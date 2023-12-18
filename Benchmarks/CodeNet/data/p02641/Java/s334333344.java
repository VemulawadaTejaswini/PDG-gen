import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
  		if(b==0) {
			System.out.println(a);
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<b;i++) {
			map.put(scn.nextInt(), 1);
		}
		int p=Integer.MAX_VALUE;
		int q=Integer.MAX_VALUE;
		for(int i=a;i>0;i--) {
			if(!map.containsKey(i)) {
				p=a-i;
				break;
			}
		}
		for(int i=a+1;i<=100;i++) {
			if(!map.containsKey(i)) {
				 q=i-a;
				break;
			}
		}
		if(p<=q) {
			System.out.println(a-p);
		}
		else {
			System.out.println(a+q);
		}
 
	}
 
}