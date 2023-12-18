import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int n = sc.nextInt();
        int[] a = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
        }
        Sort s = new Sort( n, a );
        s.sort();
        s.printA();
        System.out.println( s.count );
    }
}

class Sort {
    public int N;
    public int[] A;
    public int count = 0;

    Sort( int N, int[] A ){
        this.N = N;
        this.A = A;
    }

    public void sort(){
        int tmp = 0;
        boolean flag = true;
        while( flag ){
            flag = false;
            int n = this.N;
            for( int j = this.N-1; j > 0 ; j-- ){
                if( this.A[j] < this.A[j - 1] ){
                    this.count++;
                    tmp = this.A[j];
                    this.A[j] = this.A[j - 1];
                    this.A[j -1] = tmp;
                    flag = true;
                }
            }
        }
    }

    public void printA(){
        for( int i = 0; i < this.N; i++ ){
            System.out.print( this.A[i] + " " );
        }
        System.out.println("");
    }
}

