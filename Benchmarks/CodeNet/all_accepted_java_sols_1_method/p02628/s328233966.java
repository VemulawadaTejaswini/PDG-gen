import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       ArrayList<Integer> arrayList = new ArrayList<Integer>();
       for(int i=0;i<n;i++){
           arrayList.add(sc.nextInt());
       }
       int sum = 0;
       for(int i=0;i<k;i++){
           int idx = 0;
           int min = 999999;
           for(int j=0;j<arrayList.size();j++){
               if(arrayList.get(j)<min){
                   idx = j;
                   min = arrayList.get(j);
               }
           }
           sum += arrayList.get(idx);
           arrayList.remove(idx);
       }

        System.out.println(sum);
    }

}
