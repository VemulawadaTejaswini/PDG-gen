import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int[]a = new int[5];
    ArrayList<Integer>b = new ArrayList<>();

    int count = 0;
    int all = 0;
    for(int i=0; i<5; i++) {
    	a[i] = sc.nextInt();
    	if(a[i]%10==0) {
    		all += a[i];
    		count++;
    	}
    }
    if(count == 5) {
    	System.out.println(all);
    }else{
    	for(int i=0; i<5; i++) {
       	if(a[i]%10 != 0) {
    		b.add(a[i]%10); 
    	}
    	}
    Collections.sort(b);
    int last = 0;
    for(int i=0; i<5; i++) {
    	if(a[i]%10 == b.get(0)) {
    		last = a[i];
    		break;
    	}
    }
    int al = 0;
    int cou = 0;
    for(int i=0; i<5; i++) {
    	if(a[i] != last) {
    		if(a[i]%10==0) {
    			al += a[i];
    		}else {
    			al += ((a[i]/10)+1)*10;
    		}
    		cou++;
    	}
     }
    if(cou != 4) {
    	al += ((last/10)+1)*10*(4-cou);
    }
    System.out.println(al + last);
    }
}
}