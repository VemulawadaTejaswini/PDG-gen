import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String tile = sc.nextLine();
        sc.close();

        int tile_length = tile.length();
        int plan1_pieces = 0;
        int plan2_pieces = 0;

        for(int i = 0; i < tile_length; i++){
            char curTile = tile.charAt(i);
            if(i % 2 == 0){
                if(curTile == '1') plan1_pieces++;
                else plan2_pieces++;
            }
            else{
                if(curTile == '0') plan1_pieces++;
                else plan2_pieces++;
            }
        }

        System.out.println(Math.min(plan1_pieces, plan2_pieces));
    }
}
