import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String n=sc.next();
		while(!n.equals("0")){
			System.out.println(sum(n));
			n=sc.next();
		}
	}
	
	private static int sum(String s){
		int r=0;
		if(s.length()==1){
			r=Integer.parseInt(s);
		}else{
			r=Integer.parseInt(s.substring(0,1))+sum(s.substring(1));
		}
		return r;
	}
}