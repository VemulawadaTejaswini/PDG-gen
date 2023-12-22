import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

  private static final String[] MM = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

  public static void main(String[] args) {

    String sDate = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      sDate = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    String numOne = sDate.substring(0, 2);
    String numTwo = sDate.substring(2, 4);

    boolean isOne = false;
    boolean isTwo = false;

    for (int i = 0; i < MM.length; i++) {

      if (isOne == false && MM[i].equals(numOne)) {
        isOne = true;
      }

      if (isTwo == false && MM[i].equals(numTwo)) {
        isTwo = true;
      }
    }

    if (isOne && isTwo) {
      System.out.print("AMBIGUOUS");
    } else if (isOne == false && isTwo == false) {
      System.out.print("NA");
    } else if (isOne) {
      System.out.print("MMYY");
    } else if (isTwo) {
      System.out.print("YYMM");
    }
  }
}
