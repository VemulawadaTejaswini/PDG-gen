import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n, x, x1, x2, x3;
        int counter;
        while(true){
            counter = 0;
            n = scanner.nextInt();
            x = scanner.nextInt();
            if(n == 0 && x == 0)break;
            for(int i = 1; i <= n; i++){
                x1 = x;
                x1 -= i;
                if(x1 > 1){
                    for(int j = i+1; j <= n; j++){
                        x2 = x1;
                        x2 -= j;
                        if(x2 > 0){
                            for(int k = j+1; k <= n; k++){
                                x3 = x2;
                                x3 -= k;
                                if(x3 == 0)counter++;
                            }
                        }
                    }
                }
            }
            System.out.println(counter);
        }
    }
}

