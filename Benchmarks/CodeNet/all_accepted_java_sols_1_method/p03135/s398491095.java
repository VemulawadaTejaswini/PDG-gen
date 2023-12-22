import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    
    String line = sc.nextLine();
    String[] lines = line.split(" ");
    
    double T = Double.parseDouble(lines[0]);
    double X = Double.parseDouble(lines[1]);
    
    System.out.println(T / X);
  }
}
