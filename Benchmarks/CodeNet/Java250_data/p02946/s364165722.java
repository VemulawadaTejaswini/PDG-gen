import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        int k = sc1.nextInt();
        int x = sc1.nextInt();
        for(int i = 0; i < k-1; i++){
            System.out.print(x-k+1+i + " ");
        }
        
        System.out.print(x + " ");

        for(int i = 0; i < k-1; i++){
            System.out.print(x+i+1 + " ");
        }
    }
}