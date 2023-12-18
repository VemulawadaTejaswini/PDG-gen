
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        int N=scanner.nextInt();
        int[] ints=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
        }
        for(int i=1;i<N;i++){
            for(int j=0;j<ints.length;j++){
                System.out.print(ints[j]);
                if(j!=ints.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
            int v=ints[i];
            int j=i-1;
            while(j>=0&&ints[j]>v){
                ints[j+1]=ints[j];
                j--;
            }
            ints[j+1]=v;
        }
        for(int j=0;j<ints.length;j++){
            System.out.print(ints[j]);
            if(j!=ints.length-1){
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}

