import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> hs = new HashSet<String>();
		String cmd, str;

		for(int i=0; i<n; i++){
			cmd = sc.next();
			str = sc.next();
			if(cmd.equals("insert")){
				hs.add(str);
			} else if(cmd.equals("find")){
				if(hs.contains(str)) System.out.println("yes");
				else                 System.out.println("no");
			}
		}
	}
}