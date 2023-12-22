import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();
    StringBuilder Sb = new StringBuilder();
    Sb.append(S);
    switch (S.charAt(K-1)){
        case 'A': Sb.replace(K-1,K,"a"); break;
        case 'B': Sb.replace(K-1,K,"b"); break;
        case 'C': Sb.replace(K-1,K,"c"); break;
    }
    System.out.println(Sb.toString());
    sc.close();
  }
}