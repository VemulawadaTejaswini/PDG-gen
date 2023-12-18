import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){
            int in1 = s.nextInt();
            if(in1==0)
                break;
            int in2 = s.nextInt();
            int count = 0;
            for(int i = in1; i <= in2 ; i++){
                if((i%4 == 0 && i%100 != 0) || (i%4 == 0 && i%400 == 0)){
                    System.out.println(i);
                    count++;
                }
            }
            if(count==0)
                System.out.println("NA");
            System.out.println();
         }

     }
}