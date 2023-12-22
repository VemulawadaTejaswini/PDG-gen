import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String str = stdIn.next();
			if(str.equals("-")){
				break;
			}
			int m = stdIn.nextInt();
		
			for(int i=0;i<m;i++){
				int shuffle = stdIn.nextInt();
				String str1 = str.substring(0,shuffle);
				String str2 = str.substring(shuffle,str.length());
				str = str2+str1;
			}
		
			System.out.println(str);
		}
	}
}