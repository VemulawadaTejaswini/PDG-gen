import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sm=1000;
		for(int i=1;i<s.length()-1;i++){
			int tmpi;
			char tmpc[] = {s.charAt(i-1),s.charAt(i),s.charAt(i+1)};
			String tmps = new String(tmpc);	
			tmpi = Integer.parseInt(tmps);
			if(sm>Math.abs(753-tmpi)){
				sm = Math.abs(753-tmpi);
			}
		}
		System.out.println(sm);
	}
}
