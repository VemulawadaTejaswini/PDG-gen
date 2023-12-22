import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] s = str.split("");
    if(s[2].equals(s[3]) && s[4].equals(s[5])){
      	System.out.println("Yes");
      	return;
    }
    System.out.println("No");
  }
}