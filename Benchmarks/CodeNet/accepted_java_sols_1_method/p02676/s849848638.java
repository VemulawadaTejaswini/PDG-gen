import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        String S = sc.next();
        
        if(S.length()<=N){
        System.out.println(S);
        }else{
        System.out.println(S.substring(0,N)+"...");
        }
	}
}