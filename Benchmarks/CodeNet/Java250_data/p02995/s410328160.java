import java.util.*;

public class Main {
  public static long gcd(long number_a, long number_b) {
    long temp_number;
    if(number_a < number_b) {
      temp_number = number_a;
      number_a = number_b;
      number_b = temp_number;
    }
    while((temp_number =number_a % number_b) != 0) {
      number_a = number_b;
      number_b = temp_number;
    }
    return number_b;
  }

  public static long lcm(long number_a, long number_b) {
    return (number_a * number_b) / gcd(number_a, number_b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long start, end, i, number_c, number_d, number_cd, temp_start, temp_end, count;
    long count_c = 1;
    long count_d = 1;
    long count_cd = 1;
    start = Long.parseLong(sc.next());
    end = Long.parseLong(sc.next());
    number_c = Long.parseLong(sc.next());
    number_d = Long.parseLong(sc.next());
    number_cd = lcm(number_c, number_d);
    temp_start = start / number_c;
    temp_end = end / number_c;
    if(start % number_c != 0) temp_start += 1;
    count_c += (temp_end - temp_start);

    temp_start = start / number_d;
    temp_end = end / number_d;
    if(start % number_d != 0) temp_start += 1;
    count_d += (temp_end - temp_start);

    temp_start = start / number_cd;
    temp_end = end / number_cd;
    if(start % number_cd != 0) temp_start += 1;
    count_cd += (temp_end - temp_start);
    count = (end - start + count_cd + 1) - (count_c + count_d);
    System.out.println(count);
  }
}
