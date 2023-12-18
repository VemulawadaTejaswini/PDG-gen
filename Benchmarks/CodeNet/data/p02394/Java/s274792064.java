import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Rectangle rectangle;
    Circle circle;
    try (Scanner scanner = new Scanner(System.in)) {
      rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt());
      circle = new Circle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
    if (rectangle.isInclude(circle)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

class Rectangle implements Figure {
  final private int x;
  final private int y;

  Rectangle(int x, int y) {
    this.x = x;
    this.y = y;
  }

  boolean isInclude(Figure figure) {
    if (getTopY() < figure.getTopY()) {
      return false;
    }
    if (getBottomY() > figure.getBottomY()) {
      return false;
    }
    if (getLeftX() > figure.getLeftX()) {
      return false;
    }
    if (getRightX() < figure.getRightX()) {
      return false;
    }
    return true;
  }

  @Override
  public int getTopY() {
    return Math.max(0, y);
  }

  @Override
  public int getBottomY() {
    return Math.min(0, y);
  }

  @Override
  public int getLeftX() {
    return Math.min(0, x);
  }

  @Override
  public int getRightX() {
    return Math.max(0, x);
  }
}

interface Figure {
  int getTopY();
  int getBottomY();
  int getLeftX();
  int getRightX();
}

class Circle implements Figure {
  final private int x;
  final private int y;
  final private int r;

  Circle(int x, int y, int r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  @Override
  public int getTopY() {
    return y + r;
  }

  @Override
  public int getBottomY() {
    return y - r;
  }

  @Override
  public int getLeftX() {
    return x - r;
  }

  @Override
  public int getRightX() {
    return x + r;
  }
}