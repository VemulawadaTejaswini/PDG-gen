import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Long> hs = new HashSet<Long>();
		String cmd, str;
		long hc;

		for(int i=0; i<n; i++){
			cmd = sc.next();
			str = sc.next();
			hc = 0;
			for(int j=0; j<str.length(); j++){
				hc += str.charAt(j) * Math.pow(31, j);
			}
			if(cmd.equals("insert")){
				hs.add(hc);
			} else if(cmd.equals("find")){
				if(hs.contains(hc)) System.out.println("yes");
				else                System.out.println("no");
			}
		}
	}
}