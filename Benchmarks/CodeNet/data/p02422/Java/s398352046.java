public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str = scan.next();
		int q = scan.nextInt();
		int a;
		int b;

		for(int i = 0;i < q;i++){
			int n = str.length();
			a = scan.nextInt();
			b = scan.nextInt();
			if("reverse".equals(str)){
				StringBuffer sb = new StringBuffer(str.substring(a,b)) ;
				String str2 = sb.reverse().toString();
				str = str.substring(0,a)+str2+str.substring(b,n);
			}else if("replace".equals(str)){
				String  str3 = scan.next();
				str = str.substring(0,a)+str3+str.substring(b,n);
			}else if("print".equals(str)){
				System.out.println(str.substring(a, b));
			}
		}
	}

}