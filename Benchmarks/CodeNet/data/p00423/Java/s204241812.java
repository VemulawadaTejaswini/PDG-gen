
import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while( (num = sc.nextInt()) != 0 ){
		int aCnt = 0;
		int bCnt = 0;
		for(int cnt = 0;cnt < num;cnt++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if( a < b ){
				bCnt += a + b;
			}else if( a > b ){
				aCnt += a + b;
			}else{
				aCnt += a;
				bCnt += b;
			}
		}
		System.out.printf("%d %d\n",aCnt,bCnt);
	}
    }
}