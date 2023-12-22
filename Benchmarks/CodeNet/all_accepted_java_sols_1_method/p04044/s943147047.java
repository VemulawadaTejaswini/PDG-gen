import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stringCount = sc.nextInt();
    int stringLength = sc.nextInt();
    String blank = sc.nextLine();
    String[] array = new String[stringCount];
    for(int i = 0; i < stringCount;i++){
      array[i] = sc.nextLine();
    }
    
	Arrays.sort(array);
    String result = "";
    for(String val : array){
      result += val;
    }
    
    System.out.println(result);
  }
}