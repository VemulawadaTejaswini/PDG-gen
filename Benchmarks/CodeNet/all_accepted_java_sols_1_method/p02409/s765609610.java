import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] a = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        int[][] bb = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        int[][] c = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        int[][] d = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        
        int num = sc.nextInt();
        int b,f,r,v;
        for(int i = 0;i < num;i++){
            b = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            v = sc.nextInt();
            switch(b){
                case 1:
                    a[f - 1][r - 1] += v;
                    break;
                case 2:
                    bb[f - 1][r - 1] += v;
                    break;
                case 3:
                    c[f - 1][r - 1] += v;
                    break;
                case 4:
                    d[f - 1][r - 1] += v;
                    break;
            }
        }

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 10;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 10;j++){
                System.out.print(" "+bb[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 10;j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 10;j++){
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        }
    }
}

