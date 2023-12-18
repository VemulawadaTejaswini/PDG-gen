import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3000][2];
        int x, y;
        int counter = 0;
        while((x=scanner.nextInt())!=0 && (y=scanner.nextInt())!=0){
            array[counter][0] = x;
            array[counter][1] = y;
            counter++;
        }
        for(int i = 0; i < counter; i++){
            System.out.println(array[i][1]+" "+array[i][0]);
        }
    }
}

