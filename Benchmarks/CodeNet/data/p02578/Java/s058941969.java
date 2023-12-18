import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int former = 0;
        int latter = 0;
        int formerStep = 0;
        List<Integer> actualList = new ArrayList<>();
        List<Integer> stepList = new ArrayList<>();
        stepList.add(0);

        for(int i = 0; i < n; i++){
            actualList.add(sc.nextInt());
        }
        sc.close();

        for(int i = 1; i < n ; i++){
            former = actualList.get(i - 1);
            latter = actualList.get(i);
            formerStep = stepList.get(i - 1);

            if((former + formerStep) <= latter){
                stepList.add(0);
            }
            else{
                stepList.add(former + formerStep - latter);
            }
        }

        System.out.println(stepList.stream().mapToInt(e -> e).sum());
        
    }
}