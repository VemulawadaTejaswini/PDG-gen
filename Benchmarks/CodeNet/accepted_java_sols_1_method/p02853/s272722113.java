import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int prizeX = 0;
        int prizeY = 0;
        int bonus = 0;
        if (X == 1) {
            prizeX += 300000;
            
        } else if (X == 2) {
            prizeX += 200000;
        } else if (X == 3) {
            prizeX += 100000;
        }
        if (Y == 1) {
            prizeY += 300000;
        } else if (Y == 2) {
            prizeY += 200000;
        } else if (Y == 3) {
            prizeY += 100000;
        }
        if (X == 1 && Y == 1) {
            bonus += 400000;
        }
        System.out.println(prizeX + prizeY + bonus);
    }
}