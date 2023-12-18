import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int hour1=input.nextInt();
      int minute1=input.nextInt();
      int hour2=input.nextInt();
      int minute2=input.nextInt();
      int k=input.nextInt();
      int result=(hour2-hour1)*60+minute2-minute1;
      System.out.println(result-k);
    }
}