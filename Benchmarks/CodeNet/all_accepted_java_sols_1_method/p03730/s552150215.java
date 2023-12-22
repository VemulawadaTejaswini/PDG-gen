import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();

	int flag = -1;
	for(int i = 1; i <= 100; i++){
	    if(a*i%b==c){
		flag = 1;
		break;
	    }
	}

	/* 出力 */
	if(flag == 1){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
    }
}
