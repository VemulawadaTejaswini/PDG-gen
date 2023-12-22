import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reizou = sc.nextInt(); //冷蔵庫の種類
        int renzi = sc.nextInt(); //電子レンジの種類
        int discount = sc.nextInt(); //割引券の種類
        int[] reizous = new int[reizou];
        for(int i = 0 ; i < reizou; i++)
          reizous[i] = Integer.parseInt(sc.next());
        int[] renzis = new int[renzi];
        for(int i = 0; i < renzi; i++)
          renzis[i] = Integer.parseInt(sc.next());
        int[][] discounts = new int[discount][3];
        for(int i = 0; i < discount; i++){
          for(int j = 0; j < 3; j++){
            discounts[i][j] = Integer.parseInt(sc.next());
          }
        }

        int lower = Integer.MAX_VALUE;
        for(int i = 0 ; i < discount; i++){
          if(reizous[discounts[i][0]-1] + renzis[discounts[i][1]-1] - discounts[i][2] < lower){
            lower = reizous[discounts[i][0]-1] + renzis[discounts[i][1]-1] - discounts[i][2];
          }
        }

        Arrays.sort(reizous);
        Arrays.sort(renzis);
        if(reizous[0]+renzis[0] < lower){
          lower = reizous[0] + renzis[0];
        }

        System.out.println(lower);
    }
}
