import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int[] times = new int[5];
        for(int i = 0; i < 5; i++){
            times[i] = scan.nextInt();
        }

        // search
        int min = Integer.MAX_VALUE;
        for(int a = 0; a < 5; a++){
            int sum = times[a];
            if(sum % 10 != 0){
                sum +=10 - sum % 10;
            }
            for(int b = 0; b < 5; b++){
                if(b == a){
                    continue;
                }
                sum += times[b];
                int tempB = 0;
                if(sum % 10 != 0){
                    tempB = 10 - sum % 10;
                    sum += tempB;
                }
                for(int c = 0; c < 5; c++){
                    if(c == a || c == b){
                        continue;
                    }
                    sum += times[c];
                    int tempC = 0;
                    if(sum % 10 != 0){
                        tempC = 10 - sum % 10;
                        sum += tempC;
                    }
                    for(int d = 0; d < 5; d++){
                        if(d == a || d == b || d == c){
                            continue;
                        }
                        sum += times[d];
                        int tempD = 0;
                        if(sum % 10 != 0){
                            tempD = 10 - sum % 10;
                            sum += tempD;
                        }
                        for(int e = 0; e < 5; e++){
                            if(e == a || e == b || e == c || e == d){
                                continue;
                            }
                            sum += times[e];
                            if(sum < min){
                                min = sum;
                            }
                            sum -= times[e];
                        }
                        sum -= (times[d] + tempD);
                    }
                    sum -= (times[c] + tempC);
                }
                sum -= (times[b] + tempB);
            }
        }


        // answer
        System.out.println(min);

    }
}