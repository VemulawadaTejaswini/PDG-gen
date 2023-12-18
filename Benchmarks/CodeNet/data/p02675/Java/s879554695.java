import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		String n = sc.next();
      String result = "";
      	if(n.length() == 1){
          result = getResult(n);
        }else if(n.length() == 2){
          result = getResult(n.substring(1,2));
        }else {
          result = getResult(n.substring(2,3));
        }
		System.out.println(result);
	}
  
  private static String getResult(String val){
    String result = "";
    switch(val){
      case "2":
      case "4":
      case "5":
      case "7":
      case "9":
        result = "hon";
        break;
      case "0":
      case "1":
      case "6":
      case "8":
        result = "pon";
        break;
      case "3":
        result = "bon";
        break;
    }
    return result;
  }
}

