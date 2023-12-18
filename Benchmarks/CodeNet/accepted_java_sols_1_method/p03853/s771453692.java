import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int h = scan.nextInt();
	int w = scan.nextInt();
	String[] c = new String[h];
	for(int i = 0 ; i < h; i++){
	    c[i] = scan.next();
	}

	/* 出力 */
	for(int i = 0; i < h; i++){
	    System.out.println(c[i]);
	    System.out.println(c[i]);
	}

    }
}
