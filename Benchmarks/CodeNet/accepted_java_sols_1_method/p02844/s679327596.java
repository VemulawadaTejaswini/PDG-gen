import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		int cnt = 0;
		String tmp = "";
		for(int i=0;i<1000;i++) {
			if(i>=100)tmp=Integer.toString(i);
			else if(i>=10)tmp = "0"+Integer.toString(i);
			else tmp = "00"+Integer.toString(i);
			
			int point=0;
			boolean broken = false;
			for(int j=0;j<3;j++) {
				char now = tmp.charAt(j);
				int first = S.indexOf(now, point);
				if(first == -1) {
					broken = true;
					break;
				}
				point = first+1;
			}
			if(!broken)cnt++;
			
		}
		System.out.println(cnt);
	}
	
}

