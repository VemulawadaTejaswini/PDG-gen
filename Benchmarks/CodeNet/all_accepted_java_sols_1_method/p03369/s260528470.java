import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String topping = sc.nextLine();
		switch (topping) {
          case "ooo":
            System.out.println("1000");
          	break;
          case "oox":
            System.out.println("900");
          	break;
          case "oxo":
            System.out.println("900");
          	break;
          case "xoo":
            System.out.println("900");
          	break;
          case "oxx":
            System.out.println("800");
          	break;
          case "xox":
            System.out.println("800");
          	break;
          case "xxo":
            System.out.println("800");
          	break;
          case "xxx":
            System.out.println("700");
          	break;
        }
	}
}