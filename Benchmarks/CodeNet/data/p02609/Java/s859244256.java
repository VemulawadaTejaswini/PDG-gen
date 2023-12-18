import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String X = sc.next();
    for(int i=0; i<X.length(); i++){
      int count=0;
      String target = chX(X,i);
      int targ = bit2num(target);
      while(targ != 0){
        int pcount=popcount(target);
        if (pcount == 0){
          break;
        }
        targ = targ%pcount;
        target=Integer.toBinaryString(targ);
        count++;
      }
      System.out.println(count);
    }
  }
  
  public static String chX(String X,int index){
    String newstr ="";
    if (X.charAt(index) == '1'){
      newstr=X.substring(0,index)+"0"+X.substring(index+1);
    } else {
      newstr=X.substring(0,index)+"1"+X.substring(index+1);
    }
    return newstr;
  }

  public static int bit2num(String x){
    return Integer.parseInt(x,2);
  }
  
  public static int popcount(String target){
    int count = 0;
    for (char x : target.toCharArray()){
      if(x == '1'){
        count++;
      }
    }
    return count;
  } 
}
