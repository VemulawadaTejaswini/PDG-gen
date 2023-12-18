import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;
        int kari = 0;
        for(int i=A;i<=B;i++){
          kari = i - 10001*(i%10) - 101*((i%100)-(i%10)) - ((i%1000)-(i%100));
//          System.out.println(cnt);
          if(kari == 0){
            cnt++;
          }
        }

        System.out.println(cnt);  
	}
}