import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long former = 0;
        long latter = 0;
        long formerStep = 0;
        List<Long> actualList = new ArrayList<>();
        List<Long> stepList = new ArrayList<>();
        stepList.add(0l);

        for(int i = 0; i < n; i++){
            actualList.add(sc.nextLong());
        }
        sc.close();

        for(int i = 1; i < n ; i++){
            former = actualList.get(i - 1);
            latter = actualList.get(i);
            formerStep = stepList.get(i - 1);

            if((former + formerStep) <= latter){
                stepList.add(0l);
            }
            else{
                stepList.add(former + formerStep - latter);
            }
        }

        System.out.println(stepList.stream().mapToLong(e -> e).sum());
        
    }
}