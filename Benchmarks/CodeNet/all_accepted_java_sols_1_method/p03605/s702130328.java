import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num/10 == 9)||(num%10 ==9)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
	}
}