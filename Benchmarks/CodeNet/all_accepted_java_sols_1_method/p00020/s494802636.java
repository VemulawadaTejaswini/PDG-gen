
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner c=new Scanner(System. in);
		char r[]=c.nextLine().toCharArray();

		for(int i=0;i<r.length;i++){
			if('z'>=r[i]&r[i]>='a')
			r[i]=(char)(r[i]-'a'+'A');
		}
		System.out.println(r);
	}
}