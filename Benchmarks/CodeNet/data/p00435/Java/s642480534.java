import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		char[] str;
		try{
			scan = new Scanner(System.in);
			str = scan.next().toCharArray();
		}finally{
			if(scan !=null)scan.close();
		}
		for(int i =0 ;i <str.length;i++){
			System.out.printf("%c",change(str[i]));
		}
		System.out.println();
	}
	private static char change(char data){
		int d = (int)data;
		d -= 3;
		if(d < 'A')
				d +='Z' - 'A';
		return (char) d;
	}
}