import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String s = sc.next();

		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c+a<91){
			    System.out.print((char)(c+a));
			}else{
			    System.out.print((char)(c+a-26));
			}
			
		}
		// 出力
		System.out.println("");
    }
}
