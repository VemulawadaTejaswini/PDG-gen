
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(sc.hasNext()) {
        		
        		int a  = 0;
        		String str = sc.next();
        		
        		for(int i=0;i<4;i++) {
        			char b = str.charAt(i);
        			if(b=='+')
        				a++;
        			if(b=='-')
        				a--;
        		}
        		System.out.println(a);
        		
        	}
        }
    }
}
