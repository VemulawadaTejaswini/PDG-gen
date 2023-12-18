import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int [] array = new int[3];
        for(int i = 0;i<array.length;i++){
            array[i] = scan.nextInt();
        }
        for(int j=0;j<array.length - 1;j++){
            int min_index = j;
            for(int k = j+1; k < array.length; k++){
                if(array[k] < array[min_index]){
                    int temp = array[min_index];
                    array[min_index] =  array[k];
                    array[k] = temp;
                }
            }
        }
       System.out.printf("%d %d %d\n",array[0],array[1],array[2]);
        
    }
}
