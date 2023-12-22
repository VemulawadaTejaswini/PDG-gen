import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a1[] = {1,3,5,7,8,10,12};
    int a2[] = {4,6,9,11};
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    for(int i = 0; i < 7; ++i){
      if(x == a1[i]){
        count1 +=1;
      }
    }
    for(int i = 0; i < 4; ++i){
      if(x == a2[i]){
        count2 +=1;
      }
    }
      
    for(int i = 0; i < 7; ++i){
      if(y == a1[i]){
        count1 +=1;
      }
    }
    for(int i = 0; i < 4; ++i){
      if(y == a2[i]){
        count2 +=1;
      }
    }
    
    if(x==2 && y==2){
      count3 = 2;
    }
    
    if(count1==2 || count2==2 || count3==2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}