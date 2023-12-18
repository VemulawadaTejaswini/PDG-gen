import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			String s = Integer.toBinaryString(n);
			boolean go =  true;
			for(int i=s.length();i>0;i--){
				String t = s.substring(i-1,i);
				if(t.compareTo("1")==0){
					if(go==false)System.out.print(" ");
					System.out.print((int)Math.pow(2,s.length()-i));
					go = false;
				}
			}
			System.out.println();
		}
	}	
}