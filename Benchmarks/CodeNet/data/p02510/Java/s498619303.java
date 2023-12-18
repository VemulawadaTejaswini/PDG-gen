import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			while(scan.hasNext()){
				String data = scan.next();
				if(data.equals("-"))break;
				int n = scan.nextInt();
				for(int i = 0 ; i < n;i++){
					int h = scan.nextInt();
					int m = data.length() - h;
					int o = data.length();
					data = data.substring(m,o) + data.substring(0,m);
				}
				System.out.println(data);
			}
		}finally{
			scan.close();
		}
	}
}