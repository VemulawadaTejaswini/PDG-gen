import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b;
        int f;
        int r;
        int v;
        ArrayList<Integer> building1 = new ArrayList<Integer>();
        ArrayList<Integer> building2 = new ArrayList<Integer>();
        ArrayList<Integer> building3 = new ArrayList<Integer>();
        ArrayList<Integer> building4 = new ArrayList<Integer>();
        clear(building1);
        clear(building2);
        clear(building3);
        clear(building4);
        for(int i = 0;i <= n - 1;i++){
            b = scan.nextInt();
            f = scan.nextInt();
            r = scan.nextInt();
            v = scan.nextInt();
            switch(b){
                case 1:
                    vary(building1,f,r,v);
                    break;
                case 2:
                    vary(building2,f,r,v);
                    break;
                case 3:
                    vary(building3,f,r,v);
                    break;
                case 4:
                    vary(building4,f,r,v);
                    break;
            }
        }
        //出力
        dp(building1);
        System.out.println("####################");
        dp(building2);
        System.out.println("####################");
        dp(building3);
        System.out.println("####################");
        dp(building4);
    }

    public static void clear(ArrayList<Integer> building){
        for(int i = 0;i <= 29;i++){
            building.add(0);
        }    
    }
    
    //部屋の人数の処理
    public static void vary(ArrayList<Integer> building,int floor,int room,int number){
        building.set((floor - 1) * 10 + room - 1,building.get((floor - 1) * 10 + room - 1) + number);
    }
    
    //出力
    public static void dp(ArrayList<Integer> building){
        String st = "";
        for(int i = 0;i <= 29;i++){
            if(i <= 8){
                st += " " + building.get(i);
            }else if(i == 9){
                st += " " + building.get(i);
                System.out.println(st);
                st = "";
            }else if(i >= 10 && i <= 18){
                st += " " + building.get(i);
            }else if(i == 19){
                st += " " + building.get(i);
                System.out.println(st);
                st = "";
            }else if(i >= 20 && i <= 28){
                st += " " + building.get(i);
            }else if(i == 29){
                st += " " + building.get(i);
                System.out.println(st);
                st = "";
            }
        }
    }
}
