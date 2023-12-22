import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int s = Integer.parseInt(sc.next());

    	LinkedList<Integer> a = new LinkedList<Integer>();
    	a.add(s);

    	for (int i=0; i<=1000000; i++){
    		int a_next;
    		if (a.get(i)%2 == 0){
    			a_next = a.get(i)/2;
    		}else {
    			a_next = 3*a.get(i)+1;
    		}

    		if (a.contains(a_next)){
    			System.out.println(i+2);
    			return;
    		}else {
    			a.add(a_next);
    		}
    	}
	}
}