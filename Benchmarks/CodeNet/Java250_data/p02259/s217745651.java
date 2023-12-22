
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
        int result=bubbleSort(ints);
        for(int i=0;i<ints.length;i++){
            System.out.print(ints[i]);
            if(i!=ints.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(result);
    }
    public static int bubbleSort(int[] ints){
        int result=0;
        for(int i=ints.length;i>1;i--){
            for(int j=ints.length-1;j>ints.length-i;j--){
                if(ints[j]<ints[j-1]){
                    int tmp=ints[j];
                    ints[j]=ints[j-1];
                    ints[j-1]=tmp;
                    result++;
                }
            }
        }
        return result;
    }

}

