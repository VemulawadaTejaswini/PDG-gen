import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
		String temp;
		while((temp	=d.readLine())!= null){
			String array[]=temp.split(" ");

			int a=Integer.valueOf(array[0]).intValue(),b=Integer.valueOf(array[1]).intValue();
			String sum =String.valueOf(a+b);
			System.out.println(sum.length());
		}
	}
}