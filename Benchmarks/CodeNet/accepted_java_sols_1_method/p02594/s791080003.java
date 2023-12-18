import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();//気温
      
    	if(temp>=30){
			System.out.println("Yes");
    	}else{
        	System.out.println("No");
        }
    } 
}

