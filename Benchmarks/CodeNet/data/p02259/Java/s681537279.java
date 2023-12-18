import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        String[] input = sc.nextLine().split(" ");
        
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(input[i]);
        }
    }
}
