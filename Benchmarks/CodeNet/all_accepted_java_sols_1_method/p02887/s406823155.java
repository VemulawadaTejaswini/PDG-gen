import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    String str =sc.next();
    char chr[]=new char[str.length()];
    int count=1;
    for(int i=0;i<str.length();i++){
      chr[i]=str.charAt(i);
    }
    for(int j=1;j<chr.length;j++){
      if(chr[j-1]!=chr[j]){
      	count++;
      }	
    }
    System.out.print(count);
  }
}
