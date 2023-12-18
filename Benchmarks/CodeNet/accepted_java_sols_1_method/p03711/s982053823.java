import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      int y = sc.nextInt();

      int[] data1={1,3,5,7,8,10,12};
      int[] data2={4,6,9,11};

      int count1=0;
      int count2=0;


      for (int i = 0;i<data1.length ;i++ ) {
        if(x==data1[i]){
          count1++;
        }
        if(y==data1[i]){
          count1++;
        }
      }
      for (int i = 0;i<data2.length ;i++ ) {
        if(x==data2[i]){
          count2++;
        }
        if(y==data2[i]){
          count2++;
        }
      }
      if(count1==2||count2==2||(x==2&&y==2)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }

}
}