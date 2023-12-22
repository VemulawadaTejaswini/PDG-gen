import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int max = a+b;
        if(max < a-b){
            max = a-b;
        }
        if(max < a*b){
            max = a*b;
        }
        System.out.print(max);
    }
}