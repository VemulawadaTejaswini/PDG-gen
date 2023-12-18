import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
			int p=scan.nextInt();
			for(int i=0;i<p;i++) {
				String str1=scan.next();
				int a=scan.nextInt();
				int b=scan.nextInt();
				String str3=str.substring(a,b+1);
				String str4="";
				if(str1.equals("replace")) {
					String str2=scan.next();
					str=str.replaceAll(str3,str2);
				}else if(str1.equals("reverse")) {
					for(int i1=str3.length()-1;i1>=0;i1--) {
					str4=str4+str3.charAt(i1);
					}
					str=str.replaceAll(str3,str4);
				}else if(str1.equals("print")) {
					System.out.println(str3);
				}
			}
			scan.close();
		}
}
