public class Main {
	public static void main(String[] args) {
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		
		while(true){
			char[] s = stdIn.next().toCharArray();
			if(s.length<2){
				break;
			}
			int a=0, b=0;
			for(int i=1;i<s.length;){
				if(s[i++]<'B') a++; else b++;
			}
			if(a>b) a++; else b++;
			System.out.println(a+" "+b);
		}
	}
}