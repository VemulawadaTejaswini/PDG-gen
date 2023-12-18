import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.EnumMap;

public class Main {

  public static void main(String[] args) {
    final List<Judge> judges = new JudgeReader().read();
    final Map<Judge, Integer> countOrNull = new JudgeCounter().countOrNull(judges);
    new CountPrinter().write(countOrNull);
  }

static class JudgeCounter {
  public Map<Judge, Integer> countOrNull(final List<Judge> judges) {
    final Map<Judge, Integer> countBuilder = new EnumMap<>(Judge.class);
    for (final Judge judge : judges) {
      countBuilder.compute(judge, this::increment);
    }
    return Map.copyOf(countBuilder);
  }
  private Integer increment(final Judge judge, final Integer count) {
    if (count == null) {
      return 1;
    }
    return count + 1;
  }
}

static class JudgeReader {

  public List<Judge> read() {
    final Scanner scanner = new Scanner(System.in);
    final int testAmount = scanner.nextInt();
    final List<Judge> judgeBuilder = new ArrayList<>(testAmount);
    for (int i = 0; i < testAmount; i++) {
      judgeBuilder.add(Judge.valueOf(scanner.next()));
    }
    return List.copyOf(judgeBuilder);
  }

}

}

class CountPrinter {
  public void write(final Map<Judge, Integer> countOrNull) {
    System.out.printf("AC x %d\n", countOrNull.getOrDefault(Judge.AC, 0));
    System.out.printf("WA x %d\n", countOrNull.getOrDefault(Judge.WA, 0));
    System.out.printf("TLE x %d\n", countOrNull.getOrDefault(Judge.TLE, 0));
    System.out.printf("RE x %d\n", countOrNull.getOrDefault(Judge.RE, 0));
  }
}

enum Judge {
  AC,
  WA,
  TLE,
  RE,
  ;
}
