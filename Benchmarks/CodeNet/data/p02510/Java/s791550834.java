import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String str = stdIn.next();
			if(str.equals("-"))break;
			
			int forTimes = stdIn.nextInt();
			for(int i = 0;i < ;i++){
				int h = stdIn.nextInt();
				String toRight = str.substrint(0,h);
				String toLeft = str.substrint(h);
				str = toLeft + toRight;
			}
			System.out.println(str);
		}
	}

}