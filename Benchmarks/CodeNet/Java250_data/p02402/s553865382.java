import java.util.Scanner;
  
class Main{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int x = sc.nextInt();
           int tmp =0;
           int[] num = new int[x];
  
           int min = 1000000;
           int max = -1000000;
           long sum = 0;
  
           for(int i=0; i<num.length; i++){
                    tmp = sc.nextInt();
                    num[i] = tmp;
           }
              
           for(int i=0; i<num.length; i++){
                    if(min > num[i]){
                       min = num[i];
                    }
           }
  
           for(int i=0; i<num.length; i++){
                    if(max < num[i]){
                       max = num[i];
                    }
           }
  
           for(int i=0; i<num.length; i++){
                    sum += num[i];
           }
            
           System.out.print(min);
           System.out.print(' ');
           System.out.print(max);
           System.out.print(' ');
           System.out.println(sum);
  
       }
}
