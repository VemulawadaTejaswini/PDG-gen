import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char c = scanner.nextLine().charAt(0);
    int i = c;
    int z = 'Z';

    if(i <= z){
        System.out.println("A");
    }else{
        System.out.println("a");
    }
   
    scanner.close();
    return;
    

  }
}
