import java.util.*;
class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int tempInt = 0;
      int sum = 0;
      int div=0;
      int min=10;
      for(int i = 0;i<5;i++){
        tempInt = sc.nextInt();
        div = tempInt%10;
        if(div==0){
          sum+= tempInt;
        }else{
          sum+= (int)(tempInt/10)*10+10;
          if(div<min)
            min=div;
        }
      }
      System.out.println(sum-10+min);
    }
}