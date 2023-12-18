import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 */

public class Main {
	
	public static void printlnYN(boolean b){
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) throws IOException {
		
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int san = 0, tyo = 0, ei = 0, don = 0;
		
    	while(true){
    		int n1 = sc.nextInt();
    		int n2 = sc.nextInt();
    		int n3 = sc.nextInt();
    		
    		if(n1 + n2 > n3 && n1 + n3 > n2 && n3 + n2 > n1){
    			san++;
    			int nn1 = n2*n2 + n3*n3 - n1*n1;
    			int nn2 = n1*n1 + n3*n3 - n2*n2;
    			int nn3 = n2*n2 + n1*n1 - n3*n3;
    			
    			if(nn1 == 0 || nn2 == 0 || nn3 == 0) tyo++;
    			else if(nn1 < 0 || nn2 < 0 || nn3 < 0) don++;
    			else ei++;
    			
    		}else break;
    	}
    	
    	System.out.println(san + " " + tyo + " " + ei + " " + don);
	}

}
