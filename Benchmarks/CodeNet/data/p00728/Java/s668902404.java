import java.util.ArrayList;
import java.util.Scanner;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    Scanner _scanner = new Scanner(System.in);
    Scanner sc = _scanner;
    boolean _solveQ = ICPCScoreTotalizerSoftware.solveQ(sc);
    boolean _while = _solveQ;
    while (_while) {
      boolean _solveQ_1 = ICPCScoreTotalizerSoftware.solveQ(sc);
      _while = _solveQ_1;
    }
  }
  
  public static boolean solveQ(final Scanner sc) {
    int n = sc.nextInt();
    boolean _equals = (n == 0);
    if (_equals) {
      return false;
    }
    ArrayList<Integer> _arrayList = new ArrayList<Integer>();
    ArrayList<Integer> list = _arrayList;
    int i = 0;
    boolean _lessThan = (i < n);
    boolean _while = _lessThan;
    while (_while) {
      {
        int _nextInt = sc.nextInt();
        list.add(Integer.valueOf(_nextInt));
        int _plus = (i + 1);
        i = _plus;
      }
      boolean _lessThan_1 = (i < n);
      _while = _lessThan_1;
    }
    i = 0;
    Integer max = list.get(0);
    Integer min = list.get(0);
    int sum = 0;
    boolean _lessThan_1 = (i < n);
    boolean _while_1 = _lessThan_1;
    while (_while_1) {
      {
        Integer _get = list.get(i);
        int _plus = (sum + (_get).intValue());
        sum = _plus;
        Integer _get_1 = list.get(i);
        int _max = Math.max((max).intValue(), (_get_1).intValue());
        max = Integer.valueOf(_max);
        Integer _get_2 = list.get(i);
        int _min = Math.min((min).intValue(), (_get_2).intValue());
        min = Integer.valueOf(_min);
        int _plus_1 = (i + 1);
        i = _plus_1;
      }
      boolean _lessThan_2 = (i < n);
      _while_1 = _lessThan_2;
    }
    int _minus = (sum - (max).intValue());
    int _minus_1 = (_minus - (min).intValue());
    sum = _minus_1;
    int _minus_2 = (i - 2);
    n = _minus_2;
    int ave = (sum / n);
    InputOutput.<Integer>println(Integer.valueOf(ave));
    return true;
  }
}