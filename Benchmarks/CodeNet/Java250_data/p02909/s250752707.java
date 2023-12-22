import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		
      	String S = scan.next();
		String[] tenki = {"Sunny", "Cloudy", "Rainy"};

      	String rlt = "";      
      	if(S.equals(tenki[0])){
          rlt = tenki[1];
        }
        if(S.equals(tenki[1])){
          rlt = tenki[2];
        }
        if(S.equals(tenki[2])){
          rlt = tenki[0];
        }
     	System.out.println(rlt);
    }
}
