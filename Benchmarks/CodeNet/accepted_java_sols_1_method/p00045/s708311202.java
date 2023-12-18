import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count=0;
    int sales=0;
    int sales_quantity=0;
    while(sc.hasNext()) {
      String line = sc.nextLine();
      String[] a  = line.split(",");
      sales += Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
      sales_quantity += Integer.parseInt(a[1]);
      count++;
    }
    double avg = sales_quantity * 10 / count;
    System.out.println(String.valueOf(sales));
    System.out.println(String.valueOf(Math.round(avg/10)));
  }
}