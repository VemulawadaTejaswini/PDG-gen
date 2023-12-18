import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    String crlf = System.getProperty("line.separator");
    boolean[][] cards = new boolean[4][13];
    int num = in.nextInt();
    char suit;
    int rank;
    
    while (num != 0) {
      suit = in.next().charAt(0);
      rank = in.nextInt() - 1;
      
      switch (suit) {
        case 'S': cards[0][rank] = true; break; 
        case 'H': cards[1][rank] = true; break; 
        case 'C': cards[2][rank] = true; break; 
        case 'D': cards[3][rank] = true; break; 
      }
      num--;
    }
    
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 13; j++) {
        if (cards[i][j] == false) {
          switch (i) {
            case 0: output.append("S").append(" ").append(j + 1).append(crlf); break;
            case 1: output.append("H").append(" ").append(j + 1).append(crlf); break;
            case 2: output.append("C").append(" ").append(j + 1).append(crlf); break;
            case 3: output.append("D").append(" ").append(j + 1).append(crlf); break;
          }
        }
      }
    }
    output.delete(output.length() - 1, output.length());
    System.out.println(output.toString());
  }
}