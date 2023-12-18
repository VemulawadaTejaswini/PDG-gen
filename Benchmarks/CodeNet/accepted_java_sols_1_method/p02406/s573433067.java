import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		scan.close();
		Pattern p = Pattern.compile("3");
		for(int i=1;i<=n;i++){
			if(i%3==0){
				System.out.print(" "+i);
			}else{
				Matcher m = p.matcher(Integer.toString(i));
				if(m.find())
					System.out.print(" "+i);	
				}
		}
		System.out.println("");
	}
}