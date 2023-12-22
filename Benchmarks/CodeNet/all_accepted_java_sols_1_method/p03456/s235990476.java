import java.util.*;	
public class Main {	
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();	
      String str[] = line.split(" ");	
      double num = Double.parseDouble(str[0] + str[1]);
      double square = Math.sqrt(Double.parseDouble(str[0] + str[1]));
      if(num % square == 0){System.out.println("Yes");
      }else{System.out.println("No");
      }
    }
}