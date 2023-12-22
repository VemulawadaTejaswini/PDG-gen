import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			char[] t = stdIn.nextLine().toCharArray();
			for(int i=0;i<t.length;){
				if(t[i]!='@'){
					System.out.print(t[i]);
					i++;
				}
				else{
					i += 2;
					int f = t[i-1] - '0';
					for(int j=0;j<f;j++){
						System.out.print(t[i]);
					}
					i++;
				}
			}
			System.out.println();
		}
	}
}