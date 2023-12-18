import java.util.Scanner;
 
class Main {
    public static void main(String[] args){
        boolean[][] t = new boolean[24][60];
        Scanner sc = new Scanner(System.in);
         
        for (int t1 = 0; t1 < 2; t1++){
            int n = sc.nextInt();
             
            for (int i = 0; i < n; i++){
                int h = sc.nextInt();
                int m = sc.nextInt();
                t[h][m] = true;
            }
        }
         
        boolean z = false;
        for (int h = 0; h < 24; h++){
            for (int m = 0; m < 60; m++){
                if (t[h][m]){
                    if (z){
                        System.out.print(" ");
                    }
                    else {
                        z = true;
                    }
                    System.out.printf("%d:%02d", h, m);
                }
            }
        }
         
        System.out.println("");
    }
}