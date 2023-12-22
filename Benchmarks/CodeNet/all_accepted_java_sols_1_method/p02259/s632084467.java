import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        String[] input = sc.nextLine().split(" ");
        
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(input[i]);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    count++;
                }
            }
        }
        System.out.print(array[0]);
        for(int i = 1; i < n; i++){
            System.out.print(" "+array[i]);
        }
        System.out.println("\n"+count);
        
    }
}
