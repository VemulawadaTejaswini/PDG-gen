import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int X = in.nextInt();
        int count=0;
        for(int i=0; i<=A;i++){
            for(int j=0; j<=B;j++){
                for(int k=0; k<=C; k++){
                    if(500*i + 100*j + 50*k==X){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
