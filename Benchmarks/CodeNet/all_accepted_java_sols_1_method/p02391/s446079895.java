import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x<y){
            System.out.println("a < b");
        }
        else if(x>y){
            System.out.println("a > b");
        }
        else{
            System.out.println("a == b");
        }
        
        sc.close();

	}

}
