import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str,tmp;
		int m,h;
		
		while(true){
			str = scan.next();
			if(str.equals("-")){
				break;
			}
			m = scan.nextInt();
			for(int i=0;i<m;i++){
				tmp = "";
				h = scan.nextInt();
				tmp += str.substring(h,str.length());
				tmp += str.substring(0,h);
				str = tmp;
			}
			System.out.println(str);
		}
	}
}