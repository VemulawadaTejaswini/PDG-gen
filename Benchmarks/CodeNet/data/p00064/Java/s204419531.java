import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int menseki = 0;
		int nagasa = 0;
		int a = 0,c=0,d = 0,e=0,s=0;
		String t = "";
		
		while(true){
			try {
				t = br.readLine();
				if (t.equals("")) {
					break;
				}
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
//			if(t.equals("")){
//				break;
//			}
			d = 0;
			for(int i=0;i<t.length();i++){
				if(s == 0){
					a = d+a;
					d = 0;
				}
				s = 0;
				if(t.charAt(i) == '0'){
					d = d*10 + 0;
					s = 1;
				}
				else if(t.charAt(i) == '1'){
					d = d*10 + 1;
					s = 1;
					
				}
				else if(t.charAt(i) == '2'){
					d = d*10 + 2;
					s = 1;
					
				}
				else if(t.charAt(i) == '3'){
					d = d*10 + 3;
					s = 1;
					
				}
				else if(t.charAt(i) == '4'){
					d = d*10 + 4;
					s = 1;
					
				}
				else if(t.charAt(i) == '5'){
					d = d*10 + 5;
					s = 1;
					
				}
				else if(t.charAt(i) == '6'){
					d = d*10 + 6;
					s = 1;
					
				}
				else if(t.charAt(i) == '7'){
					d = d*10 + 7;
					s = 1;
					
				}
				else if(t.charAt(i) == '8'){
					d = d*10 + 8;
					s = 1;
					
				}
				else if(t.charAt(i) == '9'){
					d = d*10 + 9;
					s = 1;
				}
				
				
			}
			a = d + a;

		}
		System.out.println(a);

		
	}

}
















//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
//public class sekibun {
//	public static void main(String[] args){
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int menseki = 0;
//		int nagasa = 0;
//		int a = 0,c=0;
//		String t = "";
//		
//		while(true){
//			try {
//				t = br.readLine();
//				if (t == null) {
//					
//				}
//			} catch (IOException e) {
//				// TODO 自動生成された catch ブロック
//				e.printStackTrace();
//			}
////			if(t.equals("")){
////				break;
////			}
//			
//
//			a = Integer.parseInt(t);
//			c = 0;
//			
//			for(int i=0;i*a<600;i++){
//				c += i*a*i*a;
//			}
//			
//			 System.out.println(c);
//			
//		}
//
//		
//	}
//
//}