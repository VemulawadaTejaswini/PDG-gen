
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int[] ints=new int[10];
        for(int i=0;i<10;i++){
            ints[i]=scanner.nextInt();
        }
        int max1=-1;
        int index1=0;
        for(int i=0;i<10;i++){
            if(max1<ints[i]){
                max1=ints[i];
                index1=i;
            }
        }
        ints[index1]=-1;
        int max2=-1;
        int index2=0;
        for(int i=0;i<10;i++){
            if(max2<ints[i]){
                max2=ints[i];
                index2=i;
            }
        }
        ints[index2]=-1;
        int max3=-1;
        int index3=0;
        for(int i=0;i<10;i++){
            if(max3<ints[i]){
                max3=ints[i];
                index3=i;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }

}

