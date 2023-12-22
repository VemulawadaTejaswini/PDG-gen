import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
    char[] ch = s.toCharArray();
    ch[3] = '8';
    s= String.valueOf(ch);
    System.out.println(s);
  }
}
