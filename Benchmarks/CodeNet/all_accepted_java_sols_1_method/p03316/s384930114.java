import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n_cp = n;
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        if(n_cp%sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
