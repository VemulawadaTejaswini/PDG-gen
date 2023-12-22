import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
 
        int k = scan.nextInt();
        int x = scan.nextInt();
		for(int i = x - k + 1; i <  k + x; i++){
          System.out.print(i);
          System.out.print(" ");
        }
    }
}