    import java.util.Scanner;
     
    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int count = 0;
            int[] A = new int[N];
            boolean isOdd = false;
     
            for( int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }
     
            while( isOdd == false ){
                for( int i = 0; i < N; i++){
                    if ( A[i] % 2 != 0 ){
                        isOdd = true;
                    }
                }
                if( isOdd == true ){
                    break;
                }
     
                for( int i = 0; i < N; i++){
                    A[i] /= 2;
                }
                count++;
            }     
            System.out.println(count);
        }
    }