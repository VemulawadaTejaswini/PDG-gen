import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			char[] line = stdIn.nextLine().toCharArray();
			int joi = 0, ioi = 0;
			for(int i=2;i<line.length;i++){
				if(line[i]=='I'&&line[i-1]=='O'){
					if(line[i-2]=='J'){
						joi++;
					}
					else if(line[i-2]=='I'){
						ioi++;
					}
				}
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}
}