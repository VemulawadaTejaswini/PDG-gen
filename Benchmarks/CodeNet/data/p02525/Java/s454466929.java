import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		
		while(true){
			int n = Integer.parseInt(sc2.nextLine());
			
			if(n == 0) break;
			else{
				String[] s = sc2.nextLine().split("[\\s]+");
				double ave =0;
				int acount = 0;
				
				for(int i=0;i<s.length;i++){
					ave += Double.parseDouble(s[i]);
				}
				ave /= n;
				
				
				for(int  i=0;i<n;i++){
					int f = Integer.parseInt(s[i]);
					acount += ((f-ave)*(f-ave));
					//System.out.println(Math.sqrt(acount));
				}
				acount /= n;
				System.out.println(Math.sqrt(acount));
			}
		}
	}
			
}