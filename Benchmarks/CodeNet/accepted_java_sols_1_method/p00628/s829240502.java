import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.equals("END OF INPUT")){
				break;
			}
			String[] nstr = str.split(" ");
			for(int i = 0;i < nstr.length;i++){
				System.out.print(nstr[i].length());
			}
			System.out.println();
		}
	}
}