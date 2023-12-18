import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int count[]=new int['z'+1];
		char cha;
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			for(i='a';i<='z';i++){
				count[i]=0;
			}
			for(i=0;i<line.length();i++){
				cha=Character.toLowerCase(line.charAt(i));
				count[cha]++;
			}
			for(i='a';i<='z';i++){
				System.out.printf("%c : %d\n",i,count[i]);
			}
		}
	}
}