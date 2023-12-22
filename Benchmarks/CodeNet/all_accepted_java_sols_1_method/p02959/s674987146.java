import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int N = scn.nextInt();
    int[] Nmonster = new int[N + 1];

    for (int i = 0; i < N + 1; i++) {
      Nmonster[i] = scn.nextInt();
    }
    long Nbeaten = 0;
    for (int i = 0; i < N; i++) {
      int Nbeatble = scn.nextInt();

      if (Nbeatble < Nmonster[i]) {
        Nbeaten += Nbeatble;

      } else {
        Nbeaten += Nmonster[i];
        Nbeatble -= Nmonster[i];
        int diff = Nbeatble - Nmonster[i + 1];
        if (diff >= 0) {
          Nbeaten += Nmonster[i + 1];
          Nmonster[i + 1] = 0;

        } else {
          Nbeaten += Nbeatble;
          Nmonster[i + 1] -= Nbeatble;
        }
      }


    }

    System.out.println(Nbeaten);

  }
}