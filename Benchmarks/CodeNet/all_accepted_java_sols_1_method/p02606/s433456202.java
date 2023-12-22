import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String aa[]=sc.nextLine().split(" ");
		int a=Integer.parseInt(aa[0]);
		int b=Integer.parseInt(aa[1]);
		int v=Integer.parseInt(aa[2]);

		System.out.println(b/v-a/v+(a%v==0?1:0));
	}
}