import java.util.*;

class Main {
  public static int getPalacePoint(int t, int aveT, List<Integer> hightList) {
    int point = 0;
    double pointT = 9999;
    for(int i = 0; i < hightList.size(); i++) {
      double targetTemperature = (t - (hightList.get(i) * 0.006));
      double diff = targetTemperature - aveT;
      if(diff < 0) {
        diff = -diff;
      }
      if(diff < pointT) {
        point = i;
        pointT = diff;
      }
    }
    return point + 1;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while(scanner.hasNextLine()) {
      int n = Integer.parseInt(scanner.nextLine());
      
      String[] values = scanner.nextLine().split(" ", 0);
      int temperature = Integer.parseInt(values[0]);
      int optTemprerature = Integer.parseInt(values[1]);
      
      String[] hights = scanner.nextLine().split(" ", 0);
      List<Integer> hightList = new ArrayList<Integer>();
      for(String h: hights) {
        hightList.add(Integer.parseInt(h));
      }
      System.out.println(getPalacePoint(temperature, optTemprerature, hightList));
     
    }
  }
}