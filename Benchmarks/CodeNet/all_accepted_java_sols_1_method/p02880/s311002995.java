import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String ans = "No"; 
        if((N % 2) == 0 && N / 2 <= 9){
            ans = "Yes";
        }else if((N % 3) == 0 && N / 3 <= 9){
                ans = "Yes";
        }else if((N % 1) == 0 && N / 1 <= 9){
            ans = "Yes";
        }else if((N % 4) == 0 && N / 4 <= 9){
            ans = "Yes";
        }else if((N % 5) == 0 && N / 5 <= 9){
            ans = "Yes";
        }else if((N % 6) == 0 && N / 6 <= 9){
            ans = "Yes";
        }else if((N % 7) == 0 && N / 7 <= 9){
            ans = "Yes";
        }else if((N % 8) == 0 && N / 8 <= 9){
            ans = "Yes";
        }else if((N % 9) == 0 && N / 9 <= 9){
            ans = "Yes";
        }
		System.out.println(ans);
     }
}