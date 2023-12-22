    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int a = Integer.parseInt(scan.next());
    		int b = Integer.parseInt(scan.next());
    		int c = Integer.parseInt(scan.next());
    		int[] abc= {a,b,c};
    		
    		int five=0;
    		int seven=0;
    		for(int i: abc) {
    			if (i==5) {
    				++five;
    			}else if(i==7){
    				++seven;
    			}
    		}
    		if (five==2 && seven==1) {
    			System.out.print("YES");
    		}else {
    			System.out.print("NO");
    		}
    }
     
    }