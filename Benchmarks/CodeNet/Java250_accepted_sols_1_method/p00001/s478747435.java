import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] value = {0,0,0};
        for(int i = 0;i < 10;i++){
            int n = sc.nextInt();
            if(n > 0 && n <= 10000){
                for(int j = 0;j < 3;j++){
                    if(n > value[j]){
                        for(int k = 1;k >= j;k--){
                            value[k + 1] = value[k];
                        }
                        value[j] = n;
                        break;
                    }
                }
            }
        }
        sc.close();
        for(int i = 0;i < 3;i++){
            System.out.println(value[i]);
        }
    }
}