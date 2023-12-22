import java.util.Scanner;
public class Main {

    
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		long K = sc.nextLong();
		double days  = 5*Math.pow(10, 15);
		long count=0;
		for(int i=0;i<s.length();i++) {
			
			int n = Integer.parseInt(s.charAt(i)+"");
			double m = Math.pow(n, days);
			count+=m;
			if (K<=count) 
			{System.out.println(n);
				break;}
		

		}
		

	}

}
