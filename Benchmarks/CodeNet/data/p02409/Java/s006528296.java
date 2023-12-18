import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] list1 = new int[3][10];
        int[][] list2 = new int[3][10];
        int[][] list3 = new int[3][10];
        int[][] list4 = new int[3][10];
        int sum = sc.nextInt();
        int a,b,c,d;
        for(int i = 0; i < sum; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if(a == 1){
                list1[b-1][c-1] = list1[b-1][c-1] + d;
            }
            if(a == 2){
                list2[b-1][c-1] = list2[b-1][c-1] + d;
            }
            if(a == 3){
                list3[b-1][c-1] = list3[b-1][c-1] + d;
            }
            if(a == 4){
                list4[b-1][c-1] = list4[b-1][c-1] + d;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int n = 0; n < 10; n++){
                if(n == 9){
                    System.out.println(" " + list1[i][9]);
                }else{
                    System.out.print(" " + list1[i][n]);
                }
            }
        }
        System.out.println("####################");
        for(int i = 0; i < 3; i++){
            for(int n = 0; n < 10; n++){
                if(n == 9){
                    System.out.println(" " + list2[i][9]);
                }else{
                    System.out.print(" " + list2[i][n]);
                }
            }
        }
        System.out.println("####################");
        for(int i = 0; i < 3; i++){
            for(int n = 0; n < 10; n++){
                if(n == 9){
                    System.out.println(" " + list3[i][9]);
                }else{
                    System.out.print(" " + list3[i][n]);
                }
            }
        }
        System.out.println("####################");
        for(int i = 0; i < 3; i++){
            for(int n = 0; n < 10; n++){
                if(n == 9){
                    System.out.println(" " + list4[i][9]);
                }else{
                    System.out.print(" " + list4[i][n]);
                }
            }
        }
    }
}
