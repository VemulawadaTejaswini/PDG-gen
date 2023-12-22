import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int line = Integer.parseInt(sc.next());
      	String line1 = sc.next();
      	String line2 = sc.next();
      
      String kekka = "";
      for(int i = 0; i < line; i ++){
        kekka = kekka + line1.substring(i,i+1) + line2.substring(i,i+1);
      }
      System.out.print(kekka);
    }
}