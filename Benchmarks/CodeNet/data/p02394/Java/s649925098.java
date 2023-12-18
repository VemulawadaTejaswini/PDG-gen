import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while(sc.hasNext()){
            String[] line = sc.nextLine().split(" ");
            int W = Integer.parseInt(line[0]);
            int H = Integer.parseInt(line[1]);
            int x = Integer.parseInt(line[2]);
            int y = Integer.parseInt(line[3]);
            int r = Integer.parseInt(line[4]);
            boolean x_range = ((x >= r) && (x <= W-r));
            boolean y_range = ((y >= r) && (y <= H-r));
 
            if(x_range && y_range ){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}