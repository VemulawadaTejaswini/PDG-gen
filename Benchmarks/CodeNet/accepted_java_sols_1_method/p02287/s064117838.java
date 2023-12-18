import java.util.Scanner;


class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int lIndex;
        int rIndex;
        int x = input.nextInt();
        int[] array = new int[x];

        for(int i = 0; i < x; i++){
            array[i] = input.nextInt();
        }
        for(int i = 0; i < x; i++){
            System.out.print("node " + (i+1) + ": ");
            System.out.print("key = " + array[i] + ", ");
            if(i > 0){
                System.out.print("parent key = " + array[(int)((i-1)/2)]+ ", ");
            }
            if(i < x/2){
                lIndex = 2*(i)+1;
                rIndex = 2*(i)+2;
                if(lIndex < x){
                    System.out.print("left key = " + array[lIndex]+ ", ");
                }
                if(rIndex < x){
                    System.out.print("right key = " + array[rIndex] + ", ");
                }
            }
            System.out.println();
        }
    }
}
