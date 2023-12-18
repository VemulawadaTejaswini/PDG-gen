import java.util.*;


class Main{
public static void main(String[] args) {
  Scanner reader=new Scanner(System.in);
  int x=reader.nextInt();
  int sum=x;
  int happy=0;
  happy=sum/500*1000;
    sum=sum-sum/500*500;
    happy+=sum/5*5;
    System.out.println(happy);


}
}