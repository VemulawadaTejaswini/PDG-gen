import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x==2){
      System.out.println(2);
    }else{
    ArrayList <Integer> li = new ArrayList <Integer>();
    li.add(2);
    int i = 3;
    int l = 0;
    while(i<1000000){
      for(int j=0;j<li.size();j++){
        if(i%li.get(j)==0){
          l++;
          break;
        }
      }
      if(l==0&&i>=x){
        System.out.println(i);
        break;
      }else if(l==0){
        li.add(i);
      }
    i++;
    l = 0;
   }
    }
  }
}
