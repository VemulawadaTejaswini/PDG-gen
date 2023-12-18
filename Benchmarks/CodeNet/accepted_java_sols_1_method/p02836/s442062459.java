import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    String rev ="";
    int half=s.length()/2;
    int count=0;
    for(int k=s.length()-1;k>=half;k--) {
        rev+=s.charAt(k);
    }
    for(int i=0;i<half;i++) {
        if(s.charAt(i)!=rev.charAt(i)) {
            count++;
        }
    }
    System.out.println(count);
}
}
