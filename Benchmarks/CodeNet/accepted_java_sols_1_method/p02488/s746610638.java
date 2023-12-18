import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			String before = new String();
			int n = scan.nextInt();
			if(n >0){
				before = scan.next();
			}
			for(int i = 1; i < n;i++){
				String next = scan.next();
				if(before.compareTo(next)>0)
					before = next.toString();
			}
			System.out.println(before);
		}finally{
			scan.close();
		}
	}
}