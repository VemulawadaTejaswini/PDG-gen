import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		String O = scan.next();
		String E = scan.next();
		
		
		char[] o =new char[O.length()];//それぞれ文字の個数分配列を用意
		char[] e =new char[E.length()];
		
		o = O.toCharArray();
		e = E.toCharArray();
		
		
		StringBuffer sb = new StringBuffer(); 
		
		if(O.length()>E.length()){
			for(int i = 0;i<E.length();i++){
				sb.append(o[i]);
				sb.append(e[i]);
			}
			
			sb.append(o[O.length()-1]);
			
			
		}else{//O=E
			
			for(int i = 0;i<O.length();i++){
				sb.append(o[i]);
				sb.append(e[i]);
			}
			
		}
		
		System.out.println(sb.toString());
		
		
	}

}
