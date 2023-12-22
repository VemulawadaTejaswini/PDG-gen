import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 入力されるお札枚数
        int N = sc.nextInt();
        // 入力される金額
        int Y = sc.nextInt();


            for(int i = 0; i <= N; i++) {
        
                for (int j = 0; j <= N - i; j++) {

                    int z = N - i - j;
                    
                    int ans = i * 10000 + j * 5000 + z * 1000;
                    
                    if(ans == Y) {
                        System.out.println(i + " " + j + " " + z);
                        return;
                    }

                }
             }

             System.out.println("-1 -1 -1");
                
            sc.close();

        }

    }

