import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int[] i = {
				Integer.parseInt(s.next()),
				Integer.parseInt(s.next()),
				Integer.parseInt(s.next())
				};
		Arrays.sort(i);
		System.out.print  (i[0]);
		System.out.print  (" ");
		System.out.print  (i[1]);
		System.out.print  (" ");
		System.out.println(i[2]);
	}
}