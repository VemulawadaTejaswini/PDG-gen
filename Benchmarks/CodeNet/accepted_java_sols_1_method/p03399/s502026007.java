import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    int BusA   = sc.nextInt();
    int BusB   = sc.nextInt();
    int TrainA = sc.nextInt();
    int TrainB = sc.nextInt();
    
    int Bus   = BusA > BusB ? BusB : BusA;
    int Train = TrainA > TrainB ? TrainB : TrainA;
    System.out.println(Train + Bus);
    }
}
