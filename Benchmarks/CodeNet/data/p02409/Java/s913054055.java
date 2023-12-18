import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,j;
        int[] num = new int[4];
        int a;
        int[][] s = new int[3][10];
        int[][] h = new int[3][10];
        int[][] c = new int[3][10];
        int[][] d = new int[3][10];
        str = scan.nextLine();
        a = Integer.valueOf(str);
        for(i = 0; i < a; i++){
            str = scan.nextLine();
            String[] card = str.split(" ", 0);
            for(j = 0; j < 4; j++){
                num[j] = Integer.valueOf(card[j]);
            }
            switch(num[0]){
                case 1:
                    s[num[1]-1][num[2]-1] += num[3];
                    break;
                case 2:
                    h[num[1]-1][num[2]-1] += num[3];
                    break;
                case 3:
                    c[num[1]-1][num[2]-1] += num[3];
                    break;
                case 4:
                    d[num[1]-1][num[2]-1] += num[3];
                    break;
            }
        }

        for(i = 0; i < 3; i++){
            for(j = 0; j < 10; j++){
                System.out.print(" "+s[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 10; j++){
                System.out.print(" "+h[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 10; j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
        System.out.println("####################");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 10; j++){
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        }
        //System.out.println("####################");
        
        scan.close();
    }
}
