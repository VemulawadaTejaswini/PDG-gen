import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();
      
      	if(line2.contains(line)){
      		if(line.charAt(0) == line2.charAt(0)){
      			System.out.println("Yes");
      		}else{
      			System.out.println("No");
      		}
        }else{
          	System.out.println("No");
        }

    }
}