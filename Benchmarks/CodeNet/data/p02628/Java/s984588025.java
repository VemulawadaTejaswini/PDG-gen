import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	ArrayList<Integer> p = new ArrayList<>();
	for(int i=0;i<n;i++){
	    p.add(sc.nextInt());
	}
	Collections.sort(p);
	int a = 0;
	for(int i=0;i<k;i++){
	    a+=p.get(i);
	}
	System.out.println(a);
	sc.close();
      }
}
