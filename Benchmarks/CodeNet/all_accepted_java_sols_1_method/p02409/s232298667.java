import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,building,floor,room,v;
        int full_house[][][] = new int[4][3][10];
         num=sc.nextInt();
        for(int i=0;i<num;i++){
            building=sc.nextInt();
            floor=sc.nextInt();
            room=sc.nextInt();
            v=sc.nextInt();
            full_house[building-1][floor-1][room-1]+=v;
        }
        for (int i=0;i< 4;i++){
            for (int j=0;j< 3;j++){
                 for(int k = 0;k < 10 ;k++){
                     System.out.print(" "+full_house[i][j][k]);
                }
                System.out.println();
            }
            if (i!=3)
                System.out.println("####################");
            
        }
    }
}
