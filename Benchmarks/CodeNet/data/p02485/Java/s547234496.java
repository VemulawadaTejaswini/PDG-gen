import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);

			while(scan.hasNext()){
				String str = scan.next();
				if(str.equals("0"))break;
				int data = 0;
				for(int i = 0 ;i < str.length();i++){
					data += Integer.parseInt(str.substring(i,i+1));
				}
				System.out.println(data);
			}
		}finally{
			if(scan !=null)
			scan.close();
		}
	}
}