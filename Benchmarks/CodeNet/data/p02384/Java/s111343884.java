import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] dice = new int [6];
        for(int x = 0; x < 6; x++){
            dice[x] = scan.nextInt();
        }
        int q = scan.nextInt();
        for (int x =0; x <q; x++) {
            int top = scan.nextInt();
            int face = scan.nextInt();
            if (top == dice[0]){
                if(face == dice[1]){
                    System.out.println(dice[2]);
                }
                else if(face == dice[2]){
                    System.out.println(dice[4]);
                }
                else if(face == dice[3]){
                    System.out.println(dice[2]);
                }
                else{
                    System.out.println(dice[3]);
                }
            }
            else if(top == dice[1]){
                if(face == dice[0]){
                    System.out.println(dice[3]);
                }
                else if(face == dice[2]){
                    System.out.println(dice[0]);
                }
                else if(face == dice[3]){
                    System.out.println(dice[5]);
                }
                else{
                    System.out.println(dice[2]);
                }
            }
            else if(top == dice[2]){
                if(face == dice[0]){
                    System.out.println(dice[1]);
                }
                else if(face == dice[1]){
                    System.out.println(dice[5]);
                }
                else if(face == dice[4]){
                    System.out.println(dice[0]);
                }
                else{
                    System.out.println(dice[4]);
                }
            }
            else if(top == dice[3]){
                if(face == dice[0]){
                    System.out.println(dice[4]);
                }
                else if(face == dice[1]){
                    System.out.println(dice[0]);
                }
                else if(face == dice[4]){
                    System.out.println(dice[5]);
                }
                else{
                    System.out.println(dice[1]);
                }
            }
            else if(top == dice[4]){
                if(face == dice[0]){
                    System.out.println(dice[2]);
                }
                else if(face == dice[2]){
                    System.out.println(dice[5]);
                }
                else if(face == dice[3]){
                    System.out.println(dice[0]);
                }
                else{
                    System.out.println(dice[3]);
                }
            }
            else{
                if(face == dice[1]){
                    System.out.println(dice[3]);
                }
                else if(face == dice[2]){
                    System.out.println(dice[1]);
                }
                else if(face == dice[3]){
                    System.out.println(dice[4]);
                }
                else{
                    System.out.println(dice[2]);
                }
            }
        }
    }
}
