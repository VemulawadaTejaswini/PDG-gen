import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String N = scanner.next();
	char[] S = new char[n];
    S = N.toCharArray();
	long r=0,g=0,b=0;
    for(char Z:S){
      if(Z == 'R')r++;
      else if (Z == 'G')g++;
      else b++;
    }
    long ans = r*g*b;
                  
    for (int i = 0; i < n-2;i++){
      char X;
      char Y;
      X = S[i];
      for (int j = i+1; j < n-1;j++){
        if (S[j] != X){
          Y = S[j];
          if(2*j-i < n){
            if(S[2*j-i] != X && S[2*j-i] != Y){
              ans--;
            }
          }
        }
      }
    }
    System.out.println(ans);
  }  
}