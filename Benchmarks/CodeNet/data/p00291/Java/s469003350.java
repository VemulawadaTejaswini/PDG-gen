public class Main{
	public static void main(String[] a) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println((s.nextInt()+s.nextInt()*5+s.nextInt()*10+s.nextInt()*50+s.nextInt()*100+s.nextInt()*500)/1000>0?1:0);
	}
}