import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNext()) {
        String[] s = scanner.nextLine().split(",");
        Student student = new Student(s[0], Double.parseDouble(s[1]), Double.parseDouble(s[2]));
        if (student.bmi.isDebu()) {
          System.out.println(student.studentId);
        }
      }
    }
  }
}

class Student {
  final String studentId;
  final Bmi bmi;

  Student(String studentId, double kg, double m) {
    this.studentId = studentId;
    this.bmi = new BmiImpl(kg, m);
  }
}

interface Bmi {
  int debu = 25;

  boolean isDebu();
}

class BmiImpl implements Bmi {

  private final double kg;
  private final double m;

  BmiImpl(double kg, double m) {
    this.kg = kg;
    this.m = m;
  }

  public double calc() {
    return kg / Math.pow(m, 2);
  }

  @Override
  public boolean isDebu() {
    return calc() >= debu;
  }
}