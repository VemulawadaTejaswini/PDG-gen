import java.util.Scanner;

public class Main{	
	public static void main(String[] arts){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			if(s.equals("-")){
				break;
			}
			int m = sc.nextInt();
			String tmp = "";
			for(int i=0;i<m;i++){
				int h=sc.nextInt();
				String a = s.substring(0,h);
				String b = s.substring(h,s.length());
				s = b + a;
			}
			System.out.println(s);
		}

		sc.close();
	}
}
