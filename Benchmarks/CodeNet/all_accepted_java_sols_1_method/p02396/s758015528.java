import java.util.Scanner;
import java.util.Iterator;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int line=0;
		for(int i = 1;input.hasNext();i++){
			line = input.nextInt();
			if(line!=0){
				System.out.println("Case "+i+": "+line);
			}else{
				break;
			}
		}
	}
}