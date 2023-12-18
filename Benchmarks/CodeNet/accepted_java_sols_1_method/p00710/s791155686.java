import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                int r = sc.nextInt();
                if(n == 0 && r == 0){
                    break;
                }
                int[] src = new int[n];
                int[] dest = new int[n];
                for(int i= 0; i < src.length; i++){
                    src[i] = src.length - i;
                }
                for(int i = 0; i < r; i++){
                    int p = sc.nextInt();
                    int c = sc.nextInt();
                    int j = 0;
                    for(; j < c; j++){
                        dest[j] = src[p - 1 + j];
                    }
                    for(; j < c + p - 1; j++){
                        dest[j] = src[j - c];
                    }
                    for(; j < src.length; j++){
                        dest[j] = src[j];
                    }
                    int[] tmp = src;
                    src = dest;
                    dest = tmp;
                }
                System.out.println(src[0]);
            }
        }
    }  
}
