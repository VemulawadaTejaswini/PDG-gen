import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ary = new char[str.length()];
		for(int i = 0; i < str.length(); ++i) {
		    ary[i] = str.charAt(i);
		}
		
		Arrays.sort(ary);
		
		boolean flag =false;
		
		for(int i = 0; i < str.length() - 1; ++i) {
		    if(ary[i] == ary[i+1]) {
		        flag = false;
		        break;
		    }
		    else {
		        flag = true;
		        continue;
		    }
		}
		
		if(flag) System.out.println("yes");
		else System.out.println("no");
		
	}
}