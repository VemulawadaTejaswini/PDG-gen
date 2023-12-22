import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int cnt = scn.nextInt();
		String a = scn.next();
		String b = scn.next();
		String result = "";
		String[] c = new String[cnt];
		String[] d = new String[cnt];
		for(int i=0;i<cnt;i++){
			c[i] = a.charAt(i)+"";
			d[i] = b.charAt(i)+"";
			result += c[i] + d[i];
		}
		System.out.println(result);
	}
}