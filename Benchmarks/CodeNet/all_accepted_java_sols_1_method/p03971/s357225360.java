import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int a = in.nextInt();
	     int b = in.nextInt();
	     in.nextLine();
	     String t = in.nextLine();
	     int tmp = b;
	     int total = a+b;
	     for(int i=0;i<n;i++)
	     {
	    	 if(t.charAt(i)=='a'&&total>0){
	    		 System.out.println("Yes");
	    		 total--;
	    	 }
	    	 else if(t.charAt(i)=='b'&&total>0&&tmp>0){
	    		 System.out.println("Yes");
	    		 total--;
	    		 tmp--;
	    	 }
	    	 else
	    		 System.out.println("No");
	    	 
	     }
	}

}
