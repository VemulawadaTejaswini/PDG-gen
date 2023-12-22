import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    List<String> str = new ArrayList<>();
    
    for (int i=0;i<2;i++){
      str.add(scan.nextLine());
    }
    
    String[] a = str.get(0).split(" ",0);
    String[] b = str.get(1).split(" ",0);
    int workD = 0;
    for(int i=0;i<b.length;i++){
      workD += Integer.parseInt(b[i]);
    }
    if(Integer.parseInt(a[0]) < workD ){
      System.out.println("-1");
    } else {
      System.out.println(Integer.parseInt(a[0]) - workD);
    }
  }
 }