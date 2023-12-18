
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      
      int[] data = new int[20];
      int num = 0,max = 0,min = 0,total = 0;

      while(true){

        Scanner sc = new Scanner(System.in);
        int cr = sc.nextInt();
        if (cr == 0) break;

        int[] values = new int[cr];

        for(int i=0; i < values.length;i++){
        	values[i] = sc.nextInt();
        }

        for(int i = 0; i < values.length;i++){
        	
          if(i == 0){
            max = values[i];
            min=values[i];
            total = 0;
            continue;
          }

          if(max < values[i]) max = values[i];
          if(min > values[i]) min = values[i];

        }

        for(int i=0; i < values.length;i++){
          total +=  values[i];
        }

        data[num] = (total-max-min)/(values.length-2);       

        num++;

      }


      for(int i=0; i < num;i++){
        	System.out.println(data[i]);
      }

      

    }

}