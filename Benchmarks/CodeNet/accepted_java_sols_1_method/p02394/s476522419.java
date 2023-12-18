import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] Array = line.split(" ");
        int W = Integer.parseInt(Array[0]);
        int H = Integer.parseInt(Array[1]);
        int x = Integer.parseInt(Array[2]);
        int y = Integer.parseInt(Array[3]);
        int r = Integer.parseInt(Array[4]);
        if((0<=x-r&&x+r<=W)&&(0<=y-r&&y+r<=H)){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}