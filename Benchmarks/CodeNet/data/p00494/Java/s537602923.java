import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.indexOf("J") < 0 || str.indexOf("O") < 0 || str.indexOf("I") < 0){
				System.out.println(0);
				continue;
			}
			String J = "";
			String O = "";
			String I = "";
			int max = 0;
			for(int i = 1;i <= str.length()/3;i++){
				J += "J";
				O += "O";
				I += "I";
				if(str.indexOf(J+O+I) >= 0){
					max = i;
				}
			}
			System.out.println(max);
		}
	}
}