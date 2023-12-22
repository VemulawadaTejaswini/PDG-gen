import java.util.*;
  
class Main{
  public static void main(String[] args){
    Scanner stdId = new Scanner(System.in);
    int a = stdId.nextInt(); 
    int b = stdId.nextInt(); 
    int c = stdId.nextInt(); 
    ArrayList<Integer> yakusu = new ArrayList<Integer>();
    for(int i=1; i<=c; i++){
      if(c%i == 0) yakusu.add(i);
    }

    int count = 0;
    for(int i=0; i<yakusu.size(); i++){
      if(a<=yakusu.get(i) && yakusu.get(i)<=b) count++;
    }
    System.out.println(count);
  }
}