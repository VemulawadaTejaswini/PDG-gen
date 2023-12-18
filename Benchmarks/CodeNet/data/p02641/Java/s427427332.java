import java.util.Scanner;
import java.util.HashSet;
//import java.util.Collections;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int n = sc.nextInt();
	HashSet<Integer> p = new HashSet<>();
	for(int i=0;i<n;i++){
	    p.add(sc.nextInt());
	}
	if(n==0){
	    System.out.println(x);
	}else{
	    for(int i=0;;i++){
		if(!p.contains(x-i)){
		    System.out.println(x-i);
		    break;
		}
		if(!p.contains(x+i)){
		    System.out.println(x+i);
		    break;
		}
	    }
	}
	sc.close();
      }
}
