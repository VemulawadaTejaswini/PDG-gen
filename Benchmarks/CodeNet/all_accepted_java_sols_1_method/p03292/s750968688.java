import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] array = new int[3];
        for(int i = 0; i < 3; i++)
            array[i] = scan.nextInt();

        Arrays.sort(array);

        int sum = 0;
        for( int i = 1; i < 3; i++){
            sum += array[i] - array[i-1];
        }
        System.out.println(sum);
    }
}
