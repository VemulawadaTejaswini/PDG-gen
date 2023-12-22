import java.util.*;

class Main
{
	public static void main(String args[]) {

		try {

			Scanner sc = new Scanner(System.in);

			int temp = Integer.parseInt(sc.next());

			int hou = temp/3600;
			int min = (temp/60) - (hou*60);
			int sec = temp - (hou*3600+min*60);

			System.out.println(hou +":"+ min +":"+ sec);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}