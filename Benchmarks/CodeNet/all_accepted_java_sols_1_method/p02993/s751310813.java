import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[]t=s.next().toCharArray();

		System.out.println(
				t[0]==t[1]||t[1]==t[2]||t[2]==t[3]
						?"Bad":"Good"
				);
	}
}
