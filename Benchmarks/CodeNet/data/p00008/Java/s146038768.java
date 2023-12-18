import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        while(sc.hasNext()){  
            int sum = sc.nextInt();
            int answer = 0;
            for(int a = 0; a < 10; a++){
                for(int b = 0; b < 10; b++){
                    for(int c = 0; c < 10; c++){
                        for(int d = 0; d < 10; d++){
                            if(a+b+c+d==sum){
                                answer++;
                            }
                        }
                    }
                }
            }
            System.out.println(answer);
        }
 
    }
}