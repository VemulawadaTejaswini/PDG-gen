import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a<b){
			if(a<c){
				if(b<c){
					System.out.println(a+" "+b+" "+c);
				}else{
					System.out.println(a+" "+c+" "+b);
				}
			}else{
				System.out.println(c+" "+a+" "+b);
			}
		}else if(b<c){
			if(c<a){
				System.out.println(b+" "+c+" "+a);
			}else{
				System.out.println(b+" "+a+" "+c);
			}
		}else{
			System.out.println(c+" "+b+" "+a);
		}		
	}
}