import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] number = new int[6];
		for(int i=0;i<6;i++){
			number[i] = stdIn.nextInt();
		}
		String str = stdIn.next();
		int c = 1;
		int n = 5;
		int w = 4;
		int s = 2;
		int e = 3;
		
		System.out.println(number[move_cube(c,n,w,s,e,str)-1]);
	}
	static int move_cube(int c,int n,int w,int s,int e,String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'S'){
				n = 7 - c;
				c = 7 - s;
				s = 7 - n;
			}
			else if(str.charAt(i) == 'N'){
				s = 7 - c;
				c = 7 - n;
				n = 7 - s;
			}
			else if(str.charAt(i) == 'W'){
				e = 7 - c;
				c = 7 - w;
				w = 7 - e;
			}
			else{
				w = 7 - c;
				c = 7 - e;
				e = 7 - w;
			}
		}
		return c;
	}
}