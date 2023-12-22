import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> enc = new HashMap<String, String>();
    Map<String, String> dec = new HashMap<String, String>();
    enc.put(" ", "101");
    enc.put("'", "000000");
    enc.put(",", "000011");
    enc.put("-", "10010001");
    enc.put(".", "010001");
    enc.put("?", "000001");
    enc.put("A", "100101");
    enc.put("B", "10011010");
    enc.put("C", "0101");
    enc.put("D", "0001");
    enc.put("E", "110");
    enc.put("F", "01001");
    enc.put("G", "10011011");
    enc.put("H", "010000");
    enc.put("I", "0111");
    enc.put("J", "10011000");
    enc.put("K", "0110");
    enc.put("L", "00100");
    enc.put("M", "10011001");
    enc.put("N", "10011110");
    enc.put("O", "00101");
    enc.put("P", "111");
    enc.put("Q", "10011111");
    enc.put("R", "1000");
    enc.put("S", "00110");
    enc.put("T", "00111");
    enc.put("U", "10011100");
    enc.put("V", "10011101");
    enc.put("W", "000010");
    enc.put("X", "10010010");
    enc.put("Y", "10010011");
    enc.put("Z", "10010000");
    dec.put("00000", "A");
    dec.put("00001", "B");
    dec.put("00010", "C");
    dec.put("00011", "D");
    dec.put("00100", "E");
    dec.put("00101", "F");
    dec.put("00110", "G");
    dec.put("00111", "H");
    dec.put("01000", "I");
    dec.put("01001", "J");
    dec.put("01010", "K");
    dec.put("01011", "L");
    dec.put("01100", "M");
    dec.put("01101", "N");
    dec.put("01110", "O");
    dec.put("01111", "P");
    dec.put("10000", "Q");
    dec.put("10001", "R");
    dec.put("10010", "S");
    dec.put("10011", "T");
    dec.put("10100", "U");
    dec.put("10101", "V");
    dec.put("10110", "W");
    dec.put("10111", "X");
    dec.put("11000", "Y");
    dec.put("11001", "Z");
    dec.put("11010", " ");
    dec.put("11011", ".");
    dec.put("11100", ",");
    dec.put("11101", "-");
    dec.put("11110", "'");
    dec.put("11111", "?");
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String encStr = "";
      String decStr = "";
      for (int ii = 0; ii < line.length(); ii++) {
        encStr += enc.get(line.substring(ii, ii + 1));
      }
      if (encStr.length() % 5 != 0) {
        encStr += "0000";
      }
      encStr = encStr.substring(0, (encStr.length() / 5) * 5);
      for (int ii = 0; ii < encStr.length(); ii += 5) {
        decStr += dec.get(encStr.substring(ii, ii + 5));
      }
      System.out.println(decStr);
    }
  }
}