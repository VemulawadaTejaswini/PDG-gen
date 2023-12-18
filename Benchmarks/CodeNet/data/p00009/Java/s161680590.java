import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Integer, Integer> primeNumberCountMap = new HashMap<>();
    ArrayList<Integer> primeNumberList = new ArrayList<>();

    int maxMapSetedNum = 1;
    primeNumberCountMap.put(maxMapSetedNum, 1);

    while (input.ready()) {
      int num = Integer.valueOf(input.readLine());
      int primeNumberCount = 0;
      createPrimeNumberList(primeNumberList, num);
      for (int primeNum : primeNumberList) {
        if (num < primeNum)
          break;
        primeNumberCount++;
      }
      System.out.println(primeNumberCount);

      ;
    }
  }

  public static void createPrimeNumberList(ArrayList<Integer> list, int limitNum) {

    if (list.size() == 0) {
      list.add(2);
    }
    boolean addFlag;
    int startNum = list.get(list.size() - 1);
    for (int i = startNum + 1; i <= limitNum; i++) {
      addFlag = true;
      for (int primeNumber : list) {
        if (i % primeNumber == 0) {
          addFlag = false;
          break;
        }
      }
      if (addFlag)
        list.add(i);
    }
  }
}