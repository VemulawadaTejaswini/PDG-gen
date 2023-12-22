import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String po[]=sc.nextLine().split("",0);
      int count=0;
      for(int i=0;i<3;i++){
      if(po[i].equals("1"))count++;
      }
      System.out.println(count);
    }
}
