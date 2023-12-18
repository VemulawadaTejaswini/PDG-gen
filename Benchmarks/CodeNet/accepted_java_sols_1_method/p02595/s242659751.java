import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        double d = Integer.parseInt(input.split(" ")[1]);
        int c = 0;
        int[][] x = new int[n][2];
        for(int i = 0; i < n ; i++){
            input = scan.nextLine();
            x[i][0] = Integer.parseInt(input.split(" ")[0]);
            x[i][1] = Integer.parseInt(input.split(" ")[1]);
            if(d >= Math.sqrt(Math.pow(x[i][0] , 2) + Math.pow(x[i][1] , 2))){
                c += 1;
            }
        }
        System.out.println(c);
    }
}
