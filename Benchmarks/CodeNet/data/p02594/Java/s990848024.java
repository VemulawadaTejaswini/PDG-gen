import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      	int temp = scan.nextInt();
      	if(temp>=30){
          	System.out.println("Yes");
        }
      	else{
        	System.out.println("No");
        }
      	scan.close();
    }
}