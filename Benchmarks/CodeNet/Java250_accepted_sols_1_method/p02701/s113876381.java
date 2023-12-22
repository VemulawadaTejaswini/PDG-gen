import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
      sc.nextLine();
      HashSet hs = new HashSet();
		for(int i = 0; i < N; i++) hs.add(sc.nextLine());
      System.out.println(hs.size());
    } 
}