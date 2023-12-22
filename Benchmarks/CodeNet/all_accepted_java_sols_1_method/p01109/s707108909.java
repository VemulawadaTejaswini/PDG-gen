import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        while(true){
        int sum=0;
        int count=0;
        int x=sc.nextInt();
        if(x==0)break;
        int[] data=new int[x];
        for(int i=0;i<x;i++){
           data[i]=sc.nextInt();
            sum+=data[i];         
        }
        for(int i=0;i<x;i++){
          if(data[i]<=sum/x){
              count++;
          }
        } 
         System.out.println(count);
      }

    }
}
