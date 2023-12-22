import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		String w=scan.next();
		int cnt=0;
		
		while(scan.hasNext()){
			String s=scan.next();
			if(s.equals("END_OF_TEXT"))
				break;
			
			s=s.toLowerCase();
			if(s.equals(w))
				cnt++;
			
		}
		
		System.out.println(cnt);
		
	}
}
