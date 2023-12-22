import java.util.Scanner;
 
public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt() * 100;
    int B = sc.nextInt() * 100;
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = sc.nextInt();
    int total =0, sugar =0;
    double ansCon =0, con =0, maxCon = (double)E / (100 + E);
    for (int i =0; i<=F; i+=A) {
      for (int j =0; j<=F; j+=B) {
        if (i ==0 && j ==0) break;
        for (int k =0; k<=F-i-j; k+=C) {
          for (int l =0; l<=F-i-j-k; l+=D) {
            con = (double)(k + l) / (i + j + k + l);
            if (i + j + k + l <= F && con >= ansCon && con <= maxCon) {
              ansCon = con;
              total = i + j + k + l;
              sugar = k + l;            
            }
          }
        }
      } 
    }
    System.out.println(total + " " + sugar);  
  }
}