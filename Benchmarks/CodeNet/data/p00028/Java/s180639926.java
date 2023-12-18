
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public void run() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in;
    int[] countData = new int[100];
    while ((in = reader.readLine()) != null) {
      int n = Integer.parseInt(in);
      countData[n-1]++;
    }

    //????????????y????????????
    int modeY = Arrays.stream(countData).max().getAsInt();

    //??????????????????
    List<Integer> datasOfMode = new LinkedList<>();
    for (int i = 0; i < countData.length; i++) {
      if (countData[i] == modeY)
        datasOfMode.add(i+1);
    }

    //??????????????????
    for (int dataOfMode : datasOfMode) {
      System.out.println(dataOfMode);
    }
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    main.run();
  }

}