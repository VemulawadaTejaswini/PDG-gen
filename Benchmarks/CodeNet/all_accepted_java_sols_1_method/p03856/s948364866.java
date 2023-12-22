import java.util.*;


public class Main
{
	
	public static void main(String[] atgs) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.replaceAll("eraser", "");
		str=str.replaceAll("erase","");
		str=str.replaceAll("dreamer","");
		str=str.replaceAll("dream","");
		if(str.equals(""))
			System.out.println("YES");
		else System.out.println("NO");
	}
}

