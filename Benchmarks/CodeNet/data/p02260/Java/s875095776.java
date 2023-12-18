
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ints=new int[n];
        for(int i=0;i<n;i++){
            ints[i]=scanner.nextInt();
        }
        int result=selectionSort(ints);
        for(int i=0;i<ints.length;i++){
            System.out.print(ints[i]);
            if(i!=ints.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(result);
    }
    public static int selectionSort(int[] ints){
        int result=0;
        for(int i=0;i<ints.length;i++){
            int minj=i;
            for(int j=i;j<ints.length;j++){
                if(ints[j]<ints[minj]){
                    minj=j;
                }
            }
            if(i!=minj){
                result++;
                int tmp=ints[i];
                ints[i]=ints[minj];
                ints[minj]=tmp;
            }
        }
        return result;
    }

}

