import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ansac = 0;
        int answa = 0;
        int anstle = 0;
        int ansre = 0;
        String str;
        for (int i=0; i<N; i++) {
            str = sc.next();
            if(str.equals("AC")) {
            	ansac = ansac + 1;
            }else if(str.equals("WA")){
            	answa = answa + 1;
            }else if(str.equals("TLE")){
            	anstle = anstle + 1;
            }else if(str.equals("RE")){
            	ansre = ansre + 1;
            }            
        }        
      		// 文字列の入力
		System.out.println("AC x " + String.valueOf(ansac));
		System.out.println("WA x " + String.valueOf(answa));
		System.out.println("TLE x " + String.valueOf(anstle));
		System.out.println("RE x " + String.valueOf(ansre));
	}
}