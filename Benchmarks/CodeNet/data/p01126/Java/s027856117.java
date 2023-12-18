import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		int a = sc.nextInt();
        		if(n==0 && m==0 && a==0) break;
        		
        		int [] line = new int [m];
        		for(int i=0;i<m;i++) {
        			line[i] = 100*sc.nextInt()+10*sc.nextInt()+sc.nextInt();
        		}
        		for(int j=m-1;j>0;j--) {
        			for(int i=0;i<j;i++) {
            			if(line[i]<line[i+1]) {
            				int temp = line[i];
            				line[i] = line[i+1];
            				line[i+1] = temp;
            			}
            		}
        		}
        		
        		for(int x :line) {
        			String s = String.valueOf(x);
        			if(a == (s.charAt(1))-'0') {
        				a = s.charAt(2)-'0';
        			}else if(a ==(s.charAt(2))-'0') {
        				a = s.charAt(2)-'0';
        			}
        			
  
        		}
        		System.out.println(a);
        	}
        }
    }
}
        		
