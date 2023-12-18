import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int counter= 0;
			String W = scan.next().toLowerCase();
			while(scan.hasNext()){
				String str = scan.next();
				if(str.equals("END_OF_TEXT"))break;
				if(str.toLowerCase().equals(W))counter++;
			}
			System.out.println(counter);
		}finally{
			scan.close();
		}
	}
}