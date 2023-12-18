import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int x;
        int[] array = new int[10000];
        while((x = scanner.nextInt())!=0){
            array[counter] = x;
            counter++;
        }
        for(int i = 0; i < counter; i++){
            System.out.println("Case "+(i+1)+": "+array[i]);
        }
    }
}

