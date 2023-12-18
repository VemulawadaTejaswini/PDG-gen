import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    Main wk = new Main();
    wk.doIt();
  }

  ArrayList<timeData> stock = new ArrayList<timeData>();
  ArrayList<timeData> result = new ArrayList<timeData>();
  ArrayList<timeData> under2 = new ArrayList<timeData>();

  void doIt(){
    for(int i=0;i<3;i++) {
      octetRead();
      // b_arrdisp("Data Read");
      toGrandStage();
    }
    toGrandStage(under2);
    // b_arrdisp("Grand Final");
    // System.out.println();

    for(timeData k : result){
      System.out.printf("%d %.2f%n",k.number,k.time);
    }
  }

  private timeData readData(){
    return new timeData(sc.nextInt(),sc.nextDouble());
  }

  private void octetRead(){
    for(int i=0;i<8;i++) stock.add(readData());
  }

  private void cropTimeTop2(){
    Collections.sort(stock);
    // b_arrdisp("Sorted");
    result.add(stock.get(0));
    result.add(stock.get(1));
    stock.remove(0);
    stock.remove(0);
  }

  private void toGrandStage(){
    cropTimeTop2();
    under2.addAll(stock);
    stock.clear();
  }

  private void toGrandStage(ArrayList<timeData> datainpt){
    stock.addAll(datainpt);
    toGrandStage();
  }

  private class timeData implements Comparable<timeData>{
    int number;
    double time;

    public timeData(int number,double time){
      this.number = number;
      this.time = time;
    }

    public int compareTo(timeData left){
      if(left.time < this.time) return 1;
      else return -1;
    }

    @Override
    public String toString(){
      return this.number + " " + this.time;
    }
  }

  private void b_arrdisp(String com){
    System.out.println(com);
    System.out.println("stock");
    System.out.println(stock);
    System.out.println("under2");
    System.out.println(under2);
    System.out.println("result");
    System.out.println(result);
  }
}