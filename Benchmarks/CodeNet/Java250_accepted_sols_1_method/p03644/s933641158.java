import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[N];
        for(int i=1;i<=N;i++){
            int x = i;
            while(i != 0){
                if(x % 2 == 0){
                    count[i-1]++;
                    x = x / 2;
                }
                else{
                    break;
                }
            }
        }
        int max = count[0];
        int soeji = 0;
        for(int i = 1;i< N;i++){
            if(count[i] > max){
                max = count[i];
                soeji = i;
            }
        }
        System.out.println(soeji+1);
    }
}
