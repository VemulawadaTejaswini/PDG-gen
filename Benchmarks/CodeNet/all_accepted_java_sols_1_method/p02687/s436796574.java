import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String a = sc.next();
      if(a.contains("B")){
        System.out.println(a.replace("B","R"));
      }else if(a.contains("R")){
        System.out.println(a.replace("R","B"));
      }
    }
}