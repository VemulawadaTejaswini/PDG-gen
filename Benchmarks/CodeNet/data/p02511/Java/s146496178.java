import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		int n;
		Scanner s = new Scanner(System.in);
		while(true){
			n = s.nextInt();

			if(n==0) break;
			int[] ok = new int[3];
			int[] no = new int[3];
			for(int i=0; i<3; i++){
				ok[i] = 0;
				no[i] = 0;
			}
				
			for(int m=0; m<n; m++){
				String str = s.next();
				String[] str_t = str.split(":");
				int hh = Integer.parseInt(str_t[0]);
				int mm = Integer.parseInt(str_t[1]);
				int MM = s.nextInt();
				int time;
				
				if(mm > MM){
					time=60-mm+MM;
				}
				else time=MM-mm;
				
				int flag;
				if(hh >= 11 && hh < 15) flag=0;
				else if(hh >= 18 && hh < 21) flag=1;
				else if( (hh >= 21 && hh < 24) || (hh >= 0 && hh < 2) ) flag=2;
				else continue;
				
				if(time <= 8) ok[flag]++;
				else no[flag]++;
				
			}
			
			String[] tmp = {"lunch ","dinner ","midnight "};
		
			for(int i=0; i<3; i++){
				if(ok[i]==0 && no[i]==0) System.out.println(tmp[i]+"no guest");
				else{
					double d = ((double)ok[i]/(double)(ok[i]+no[i]));
					System.out.println(tmp[i] + (int)(d*100));
				}
			}
			
		}
			
	}
}
	
	