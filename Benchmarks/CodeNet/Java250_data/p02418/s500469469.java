import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String s=scan.next();
		String p=scan.next();
		boolean signal=true;
		
		for(int i=0;i<s.length();i++){
			signal=true;
			for(int j=0;j<p.length();j++){
				if(s.charAt((i+j)%s.length())!=p.charAt(j)){
					signal=false;
					break;
				}
			}
			if(signal){
				break;
			}
		}
		if(signal){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		scan.close();
	}
}