import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] array = new int[num][4];
        int[][] tenant = new int[12][10];
        
        for(int i = 0; i < num; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = sc.nextInt();
            }
            int floor = (array[i][0] - 1) * 3 + array[i][1] - 1;
            int room = array[i][2] - 1;
            tenant[floor][room] += array[i][3];
            if(tenant[floor][room] < 0){
                tenant[floor][room] = 0;
            }
            
        }
        
        for(int i = 0; i < 12; i++){
            if(i != 0 && i % 3 == 0){
                System.out.println("####################");
            }
            for(int j = 0; j < 10; j++){
                System.out.print(" " + tenant[i][j]);
            }
            System.out.println();
        }
    }
}
