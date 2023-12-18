import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int x = 0;
		scan.close();
		for(int i=1;i<=n;i++){

			x=i;//Integer.toString(i);
			if(i%3==0){
				System.out.print(" "+i);
			}else{
				Pattern p = Pattern.compile("3");
				Matcher m = p.matcher(Integer.toString(i));
				if(m.find())
					System.out.print(" "+i);	
				}
		}
		System.out.println("");
	}
}