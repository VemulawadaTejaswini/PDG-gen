import java.util.*;
public class Main{
  
 public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
     ArrayList<Integer> a=new ArrayList<>();
       
          for(int i=0;i<3;i++){
               a.add(obj.nextInt());
         }
Collections.sort(a);
int sum=a.get(0)+a.get(1);
System.out.println(sum);
        



      }
}