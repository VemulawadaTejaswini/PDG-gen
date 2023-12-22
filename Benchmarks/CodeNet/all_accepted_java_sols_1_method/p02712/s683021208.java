	
	


import java.util.*; 
	public class Main {
	public static void main( String[] args) {			
					
					Scanner in = new Scanner(System.in);
					long a = in.nextInt();
					long s = 0;
					
					for(long i = 1;i<=a;i++) {
						if(i%3==0||i%5==0) {
							continue;
						}
						else {
							s = s+i;
						}
					}
					System.out.println(s);
					
			}}