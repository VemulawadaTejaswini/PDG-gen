import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int [] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(arr[i] != arr[j]) {
                    for(int k = j + 1; k < N; k++) {
                        if(arr[k] != arr[i] && arr[k] != arr[j]) {
                            if(isTriangle(arr[i], arr[j], arr[k])) {
                                count++;
                            }
                        }
                    }
                }
            }
        }




        System.out.println(count);
    }

    public static boolean isTriangle(int a, int b, int c) {
        if((a + b > c) && (a + c > b) && (c + b > a)) {
            return true;
        } else  {
            return false;
        }
    }
}
