    import java.util.Scanner;
    public class Main{
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		 int x =sc.nextInt();
    		 int y =sc.nextInt();
    		 
    		 for(int i=1; i<=100000; i++) {
    		 if((int)(i*0.08)==x && (int)(i*0.1)==y) {
    			 System.out.println(i);
    			 return;
    		 	}
    		 }	
    			 System.out.println("-1");
        }
    }