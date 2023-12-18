import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int count;
        for(;;){
            int n = scan.nextInt();
            int x = scan.nextInt();
            count = 0;
            if(n == 0 && x == 0){
                break;
            }else{
                for(int i = 1; i <= n; i++){
                    for(int j = i + 1; j <= n; j++){
                        for(int k = j + 1; k <= n; k++){
                            if(i + j + k == x){
                                if(i != j && j != k && i != k){
                                    //System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                                    count++;
                                }
                            }
                        }
                    }
                }
                System.out.println(count);
            }
        }

    }
}