import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=K; i++){
            for(int j=1; j<=K; j++){
                int a = i;
                int b = j;
                int kou = 0;
                for(int x=0; x<10; x++){
                    int max = Math.max(a, b);
                    int min = Math.min(a, b);
                    if(max%min==0 && x==0){
                        kou = min;
                        break;
                    }
                    a = min;
                    b = max % min;
                    if(a%b==0){
                        kou = b;
                        break;
                    }
                }
                for(int k=1; k<=K; k++){
                    int c = k;
                    int d = kou;
                    for(int x=0; x<10; x++){
                        int max = Math.max(c, d);
                        int min = Math.min(c, d);
                        if(max%min==0 && x==0){
                            d = min;
                            sum += d;
                            break;
                        }
                        c = min;
                        d = max % min;
                        if(c%d==0){
                            sum += d;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}