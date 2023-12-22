import java.util.*;

public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = num / 100;
		int b = (num - a*100) / 10;
		int c = (num - a*100 - b*10);

        if(a < b){
            a++;
        }else if(a == b){
             if(b < c){
                 a++;
             }
        }
        
        System.out.println(a*100 + a*10 + a);
    }
}
