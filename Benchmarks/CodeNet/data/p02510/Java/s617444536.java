import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String str = stdIn.next();
			if(str.equals("-"))break;
			
			int forTimes = stdIn.nextInt();
			for(int i = 0;i < forTimes;i++){
				int h = stdIn.nextInt();
				String toRight = str.substring(0,h);
				String toLeft = str.substring(h);
				str = toLeft + toRight;
			}
			System.out.println(str);
		}
	}

}