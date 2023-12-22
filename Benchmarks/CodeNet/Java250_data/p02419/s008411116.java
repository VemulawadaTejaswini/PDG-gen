import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			String str;
			String text = scan.next();
			int counter = 0;
			while(!(str = scan.next()).equals("END_OF_TEXT")){
				if(text.equals(str.toLowerCase()))counter++;
			}
			System.out.println(counter);
		}finally{
			if(scan!=null)scan.close();
		}
	}
}