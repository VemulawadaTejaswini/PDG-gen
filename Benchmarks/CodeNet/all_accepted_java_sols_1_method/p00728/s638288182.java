import java.util.Scanner;

public class Main{
 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  while(true){
   int max=0,min=10000;
   int sum=0;
   int human = sc.nextInt();
   if(human==0) break;
   int[] point = new int[human];

   for(int i=0;i<point.length;i++){
    point[i]=sc.nextInt();
    if(point[i]>max) max=point[i];
    if(point[i]<min) min=point[i];
    sum += point[i];
   }
   sum = sum - max - min;
   int ave=sum/(human-2);
   System.out.println(ave);
  }
 }
}