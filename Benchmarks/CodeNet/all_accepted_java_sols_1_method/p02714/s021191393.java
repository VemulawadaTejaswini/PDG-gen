import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    int l = c.length;

    int r = 0;
    int g = 0;
    int b = 0;

    for(char cc:c){
      if(cc=='R'){r++;}
      if(cc=='G'){g++;}
      if(cc=='B'){b++;}
    }
    long sum = (long)r * g * b;

    for(int i=0; i<l-1;i++){
      for(int j=i+1; j<l;j++){
        if(c[i]!=c[j]&&2*j-i<n){
          if(c[2*j-i]!=c[i]&&c[2*j-i]!=c[j]){
            sum--;
          }
        }
      }
    }

    System.out.println(sum);






  }
}