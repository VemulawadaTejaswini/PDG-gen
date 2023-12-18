import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
          String str = scan.next();
          
          String odd="";
          String even="";
          String[] strArray = str.split("");
          for(int i=1; i<=strArray.length;i++) {
            if(i%2==0) {
             even+=strArray[i-1];
            } else {
              odd+=strArray[i-1];
            }
          }
          
          if(even.contains("R") || odd.contains("L")){
            System.out.println("No");
          } else {
            System.out.println("Yes");
            
          }
        }
   
    }
}