import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Word=new String();
		Word=sc.next();
		sc.close();
		Character word[]=new Character[3];
		for(int i=0;i<3;i++)
			word[i]=Word.charAt(i);
		int count=0;
		int max=0;
		for(int i=0;i<3;i++) {
			if(word[i].equals('R')) {
				count++;
				if(count>max)
					max=count;
			}else {
				count=0;
			}
		}
		System.out.println(max);
	}
}
