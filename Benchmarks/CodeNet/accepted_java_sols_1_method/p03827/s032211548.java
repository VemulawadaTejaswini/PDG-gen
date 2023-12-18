import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String S = scan.next();
		int an = 0;
		int b = 0;
        for(int i=0 ;i<a;i++ ){

        	
        	if('I'==S.charAt(i)){
        		an++;
        	}else{
        		an--;
        	}

        	if(b<an){
        		b=an;
        	}
        }
        System.out.println(b);
    }
}