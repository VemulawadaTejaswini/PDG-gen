import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		for(; a  <= b; a++){
			if(c % a == 0)
				cnt++;
		}
		System.out.println(cnt);
        scan.close();
    }

}