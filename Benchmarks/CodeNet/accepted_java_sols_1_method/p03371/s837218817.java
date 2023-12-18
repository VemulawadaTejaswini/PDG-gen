import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pizaA = sc.nextInt();
    int pizaB = sc.nextInt();
    int pizaAB = sc.nextInt();
    int pieceOfA = sc.nextInt();
    int pieceOfB = sc.nextInt();
    if (pizaA + pizaB <= 2 * pizaAB) {
      System.out.println(pizaA * pieceOfA + pizaB * pieceOfB);
    } else {
      if (pieceOfA > pieceOfB) {
        System.out.println(2 * pizaAB * pieceOfB + 
                                                  (pieceOfA - pieceOfB) * Math.min(pizaA, 2 * pizaAB));
      } else if (pieceOfA == pieceOfB) {
        System.out.println(2 * pizaAB * pieceOfA);
      } else {
        System.out.println(2 * pizaAB * pieceOfA +
                                                 (pieceOfB - pieceOfA) * Math.min(pizaB, 2 * pizaAB));
      }
      
      
      
    }
  }
}