import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int r = scan.nextInt();
	int g = scan.nextInt();
	int b = scan.nextInt();
	int n = scan.nextInt();	      

	/* 組み合わせを考える */
	int count = 0;
	for(int i = 0; i < n/r+1; i++){
	    for(int j = 0; j < n/g+1; j++){
		if(n-(i*r+j*g) < 0){
		    break;
		}else if((n-(i*r+j*g)) % b == 0){
		    count++;
		}
	    }
	}


	System.out.println(count);
    }
}
