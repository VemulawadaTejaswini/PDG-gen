import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int sum;
        int digits = 0;
        List<Integer> list = new ArrayList<>();
       
        while(sc.hasNext()) {
        	a = sc.nextInt();
        	b = sc.nextInt();
        	sum = a + b;
        	digits = 0;
        	//System.out.println(sum);
        	for(;sum>=1;sum=sum/10) {
            	digits = digits+1;
                }
            //System.out.println(digits);
        	list.add(digits);
        }
               
        for(Iterator it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        sc.close();
    }
} 