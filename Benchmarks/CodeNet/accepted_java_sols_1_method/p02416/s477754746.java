import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			String str ;
			while(!(str = scan.next()).equals("0")){
				int sum = 0;
				for(int i = 0 ; i< str.length();i++){
					sum += Integer.parseInt(str.substring(i,i + 1));
				}
				System.out.println(sum);
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}