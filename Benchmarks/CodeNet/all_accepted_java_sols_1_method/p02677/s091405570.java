import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // 標準入力取得
    Scanner sc = new Scanner(System.in);    
    String iShortNeedle = sc.next();
    String iLongNeedle = sc.next();
    String h = sc.next();
    String m = sc.next();
    // 入力値加工
    double hour = Double.parseDouble(h);
    double min = Double.parseDouble(m);
    double wholeMin = (hour*60) + min;
    double shortNeedle = Double.parseDouble(iShortNeedle);
    double longNeedle = Double.parseDouble(iLongNeedle);

// check
//    System.out.println("shortNlength:" + shortNeedle + "cm");
//    System.out.println("longNlength:" + longNeedle + "cm");
//    System.out.println("hour:" + hour + "H");
//    System.out.println("min:" + min + "min");
//    System.out.println("wholeMin: "+ wholeMin + "min");

    double shortAngleByOneMin = (360.0/12.0)/60.0;
    double longAngleByOneMin = 360.0/60.0;
//    System.out.println("1分で短針が動く度数: "+ shortAngleByOneMin + "°");
//    System.out.println("1分で長針が動く度数: "+ longAngleByOneMin + "°");
//    System.out.println("XX分で短針が動く度数: "+ shortAngleByOneMin * wholeMin);
//    System.out.println("XX分で長針が動く度数: "+ longAngleByOneMin * min);

    // 各針の角度を計算する
    double rHour = 0; 
    double rMin = 0;
    if(wholeMin!=0){
      rHour = shortAngleByOneMin * wholeMin; 
    }
    if(min!=0){
      rMin = longAngleByOneMin * min;
    }
    double diffAngle = Math.abs(rHour - rMin);    

// check
//    System.out.println("rHour: " + rHour + "°");
//    System.out.println("rMin: " + rMin + "°");
//    System.out.println("diffAngle: " + diffAngle + "°");

    double aLength = 0;
    if(diffAngle!=0 || diffAngle!=180){
	  aLength = Math.sqrt( Math.pow(shortNeedle,2) + Math.pow(longNeedle,2) - 2 * shortNeedle * longNeedle * Math.cos(Math.toRadians(diffAngle)) );
    }else if(diffAngle==0){
      aLength = longNeedle - shortNeedle;    
    }else if(diffAngle==180){
      aLength = longNeedle + shortNeedle;
    }
    
//answer
    System.out.println(aLength);
  }
}