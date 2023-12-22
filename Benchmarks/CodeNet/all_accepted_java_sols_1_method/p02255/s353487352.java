import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        int[] num = new int[N];
        for(int i=0;i<N;i++)
            num[i] = sc.nextInt();
        for(int i=0;i<N;i++){
            System.out.print(num[i]);
            if(i!=N-1)
                System.out.print(" ");
        }
        System.out.println();
        for(int i=1;i<=N-1;i++){
            for(int j=i;j>0;j--){
                if(num[j-1]>num[j]){
                    int tmp = num[j-1];
                    num[j-1]=num[j];
                    num[j]=tmp;
                }
                else break;
            }
            for(int k=0;k<N;k++){
            System.out.print(num[k]);
            if(k!=N-1)
            System.out.print(" ");
            }
            System.out.println();
 
        }
    }
}
