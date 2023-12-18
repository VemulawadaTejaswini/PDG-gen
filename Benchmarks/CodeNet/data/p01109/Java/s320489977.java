import java.util.Scanner;

class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
       	int[] data = new int[a];
       int count = 0;
       int sum = 0;
       int avg = 0;
       for(int i=0;i<data.length;i++){
           data[i] = sc.nextInt();
           sum += data[i];
       }
       avg = sum/data.length;
       for(int i=0;i<data.length;i++){
           if(data[i] <= avg){
               count++;
           }
       }
       System.out.println(count);
   }
}
