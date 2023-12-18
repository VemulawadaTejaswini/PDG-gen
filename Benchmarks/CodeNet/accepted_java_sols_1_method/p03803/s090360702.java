import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b) System.out.println("Draw");
        else{
            for(int i=2;i<=13;i++){
                if(i==a){
                    System.out.println("Bob");
                    break;
                }
                else if(i==b) {
                    System.out.println("Alice");
                    break;
                }
            }
        }
	}
}
