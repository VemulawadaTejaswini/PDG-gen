import java.util.Scanner;
class Sol{
	public static void  main(String[] args){
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      sc.nextLine();
      String s = sc.nextLine();
      if(s.length() <= k)
        System.out.print(s);
      else
        System.out.print(s.substring(0, k) + "...");
    }
}
