import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] room = new int[4][3][10];
        	for(int a=0;a<n;a++){
                int i = sc.nextInt();
        		int j = sc.nextInt();
        		int k = sc.nextInt();
        		int v = sc.nextInt();
        			room[i-1][j-1][k-1] += v;
            }
         for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    System.out.print(" " + room[i][j][k]);
                }
                System.out.println();
            }
             if(i<3){
             for(int c=0;c<20;c++){
            	 System.out.print("#");
             }
             System.out.println();
            }
         }
    }
}
