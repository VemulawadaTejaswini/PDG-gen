import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int f = 0;
		
		while(sc.hasNext()){
			if(f == 1){
				System.out.println();
			}
			String str = sc.next();
			int n = str.length();
			String s0="", s1="", s2="", s3="", s4="", s5="", s6="";
			
			for(int i = 0; i < n; i++){
				int t = Integer.parseInt(str.substring(i, i+1));
				if(t < 5){
					s0 += "*";
					s1 += " ";
				} else {
					s0 += " ";
					s1 += "*";
				}
				if(t == 0 || t == 5){
					s2 += " ";
				} else {
					s2 += "*";
				}
				if(t == 1 || t == 6){
					s3 += " ";
				} else {
					s3 += "*";
				}
				if(t == 2 || t == 7){
					s4 += " ";
				} else {
					s4 += "*";
				}
				if(t == 3 || t == 8){
					s5 += " ";
				} else {
					s5 += "*";
				}
				if(t == 4 || t == 9){
					s6 += " ";
				} else {
					s6 += "*";
				}
			}
			
			for(int i = 5-n; i > 0; i--){
				s0 = "*" + s0;
				s1 = " " + s1;
				s2 = " " + s2;
				s3 = "*" + s3;
				s4 = "*" + s4;
				s5 = "*" + s5;
				s6 = "*" + s6;
			}
			
			System.out.println(s0);
			System.out.println(s1);
			System.out.println("=====");
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println(s5);
			System.out.println(s6);
			f = 1;
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}