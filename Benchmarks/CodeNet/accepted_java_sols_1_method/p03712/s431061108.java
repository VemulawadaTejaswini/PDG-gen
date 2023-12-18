import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int h = scan.nextInt();
	int w = scan.nextInt();
	String[] s = new String[h+2];
	for(int i = 1; i < h+1; i++){
	    s[i] = scan.next();
	}

	/* 上端と下端 */
	s[0] = "#";
	s[h+1] = "#";

	/* '#'追加操作 */
	for(int i = 0; i < h+2; i++){
	    if(i == 0 || i == h+1){
		for(int j = 0; j < w+1; j++){
		    s[i] += "#";
		}
	    }else{
		s[i] = "#"+s[i]+"#";
	    }
	}

	/* 出力 */
	for(int i = 0; i < h+2; i++){
	    System.out.println(s[i]);
	}
    }
}	
