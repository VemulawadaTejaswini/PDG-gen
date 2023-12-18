import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int N, temp, count;
        double[] efficiency;
        Fruit[] fruits, answer;
        boolean[] check;
        while((N = sc.nextInt()) != 0){
            efficiency = new double[N];
            fruits = new Fruit[N];
            answer = new Fruit[N];
            check = new boolean[N];
            Arrays.fill(check, true);
            temp = 0;
            for(int i = 0; i < N; i++){
                fruits[i] = new Fruit(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                        sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            for(int i = 0; i < N; i++) efficiency[i] = fruits[i].efficiency;
            Arrays.sort(efficiency);
            outer:
            for(int i = N - 1; i >= 0; i--){
                for(int j = 0; j < N; j++)
                    if(fruits[j].efficiency == efficiency[i] && check[j]){
                        answer[temp++] = fruits[j];
                        check[j] = false;
                        continue outer;
                    }
            }

            for(int i = 0; i <= N - 2; i++){
                temp = 0;
                while(i <= N - 2 && answer[i + 1].efficiency == answer[i].efficiency){
                    i++;
                    temp++;
                }
                if(temp > 0) sortDirectory(answer, i - temp, i);
            }
            for(Fruit f : answer) System.out.println(f.name);
            System.out.println("#");
        }
    }


    static void sortDirectory(Fruit[] f, int a, int b){
        String temp;
        for(; a < b; a++){
            for(int j = b-1; j >= a; j--){
                if(f[j + 1].name.compareTo(f[j].name) < 0){
                    temp = f[j + 1].name;
                    f[j + 1].name = f[j].name;
                    f[j].name = temp;
                }
            }
        }
    }

    static class Fruit{
        String name;
        int P, A, B, C, D, E, F, S, M, total_time, total_price;
        double efficiency;

        Fruit(String name, int p, int a, int b, int c, int d, int e, int f, int s, int m){
            this.name = name;
            P = p;
            A = a;
            B = b;
            C = c;
            D = d;
            E = e;
            F = f;
            S = s;
            M = m;
            calcFruitEfficiency();
        }

        void calcFruitEfficiency(){
            total_time = (A + B + C + D + E)*M;
            total_price = S*F*M - P;
            efficiency = (double)total_price/(double)total_time;
        }
    }
}