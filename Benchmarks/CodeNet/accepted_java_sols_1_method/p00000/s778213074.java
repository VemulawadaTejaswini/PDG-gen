public class Main {
    static int x;
    public static void main(String[] args) throws Exception {
        // Here your code !
        for( int i = 1; i <= 9;i++ ){
            for( int r = 1; r <= 9; r++){
                int kei = i * r;
                System.out.println( i + "x" + r + "=" + kei);
            }
        }
    }
}