import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i;
        int[] array = new int[2];
        
        i = 1;
        int x;
        int y;
        while (i != 0) {
            for (i = 0; i < 2; i++) {
                array[i] = sc.nextInt();
            }
            if(array[0] == 0 && array[1] == 0) break;
            for(x=0;x<array[0];x++){
                for(y=0;y<array[1];y++){
                    if(x==0 || x==array[0]-1){
                        System.out.print("#");
                    }else if(y==0 || y==array[1]-1){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
        sc.close();
    }
}
