import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str[]=new String[300],str1 = s.next()+" ";
		str1=str1.toUpperCase();
		int i=1;
		while(s.hasNext()){
			str[i]=s.next();
			str[i]=str[i].toUpperCase();
			str1=str1+str[i]+" ";
			i++;
		}
		str1=str1.substring(0, str1.length()-1);
		System.out.println(str1);
	}
}