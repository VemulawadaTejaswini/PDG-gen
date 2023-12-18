import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int k = sc.nextInt();
    String s=sc.next();
    String ans = "";
    for(int i=0;i<s.length();i++) {
        int asc = (int) s.charAt(i);
        if((asc+k)<=90) {
            char as = (char) (asc+k);
            ans+=as;
        } else {
            char as = (char) ((asc-26) + k);
            ans+=as;
        }
    }
    System.out.println(ans);    
}
}
