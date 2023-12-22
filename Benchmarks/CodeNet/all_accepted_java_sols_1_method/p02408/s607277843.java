import java.util.Scanner;
class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][13];
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            String mark = sc.next();
            int number = sc.nextInt();
            
            if(mark.equals("S"))
                a[0][number - 1] = 1;
            else if(mark.equals("H"))
                a[1][number - 1] = 1;
            else if(mark.equals("C"))
                a[2][number - 1] = 1;
            else
                a[3][number - 1] = 1;
        }
                

        for(int i = 0;i < 4;i++){
            for(int j = 0; j < 13; j++){
                if(a[i][j] == 0){
                    if(i == 0){
                        System.out.println("S" + " " + (j + 1));
                    }
                    else if(i == 1){
                        System.out.println("H" + " " + (j + 1));
                    }
                    else if(i == 2){
                        System.out.println("C" + " " + (j + 1));
                    }
                    else{
                        System.out.println("D" + " " + (j + 1));
                    }
                }
            }
        }
    }
}

