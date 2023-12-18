import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    String s=sc.nextLine();
    int k=Integer.parseInt(sc.nextLine());
    char[] c=s.toCharArray();
    char comp=c[k-1];
    for(int i=0;i<n;i++){
      if(c[i]!=comp){
        c[i]='*';
      }
    }
    System.out.print(String.valueOf(c));
  }
}