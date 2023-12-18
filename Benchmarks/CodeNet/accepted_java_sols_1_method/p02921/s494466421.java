public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int sum=0;
		for(int i=0;i<3;i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
