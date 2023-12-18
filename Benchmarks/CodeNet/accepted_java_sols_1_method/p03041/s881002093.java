import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        char moji[] =S.toCharArray();
        switch(moji[K - 1]) {
            case 'A':
                moji[K - 1] = 'a';
                break;
            case 'B':
                moji[K - 1] = 'b';
                break;
            case 'C':
                moji[K -1 ] = 'c';
        }
        for(int i = 0;i < N;i++){
            System.out.print(moji[i]);
        }
    }
}
