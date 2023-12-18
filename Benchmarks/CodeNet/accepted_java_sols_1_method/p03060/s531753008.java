import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int repeatNum = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>(repeatNum);
    for(int i= 0;i<repeatNum;i++){
      list.add(sc.nextInt());
    }
    int result = 0;
    int temp=0;
    for(int j= 0;j<repeatNum;j++){
      temp= list.get(j) - sc.nextInt();
      if(temp>0){
        result+=temp;
      }
    }
    System.out.println(result);
  }
}