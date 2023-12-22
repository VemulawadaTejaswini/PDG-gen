import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		String n = as.next();

		String[] strArray = n.split("");

		int pcount = 0;



		for(int i=0;i<strArray.length;i++) {

			if(strArray[i].equals("+")){
				pcount += 1;
			}else if(strArray[i].equals("-")) {
				pcount -= 1;
			}
		}

		System.out.println(pcount);
	}
}