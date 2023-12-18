import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int[] num = new int[] {a,b,c};
        for(int n = 0;n < num.length-1;n++){
            int min = n;
            for(int i = n+1;i < num.length;i++){//最小値を決める
                if(num[min] > num[i]){
                    min = i;
                }
            }
            if(num[min] != num[n]){
                int work =num[n];
                num[n] = num[min];
                num[min] = work;
            }
        }
        System.out.println(num[0]+" "+num[1]+" "+num[2]);
    }
}
