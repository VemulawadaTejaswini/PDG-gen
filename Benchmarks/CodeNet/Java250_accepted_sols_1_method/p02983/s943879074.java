import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int r = sc.nextInt();

        int min = 10000;


        if(r - l < 2019){
            if(l%2019 > r%2019) {
                min = 0;
            } else{
                for(int i = l; i < r; i++){
                    for(int j = i+1; j <= r; j++){
                        min = Math.min(min, (i%2019)*(j%2019) % 2019);
                        if(min == 0) break;
                    }
                }
            }
        } else {
            min = 0;
        }

        System.out.println(min);
    }
}