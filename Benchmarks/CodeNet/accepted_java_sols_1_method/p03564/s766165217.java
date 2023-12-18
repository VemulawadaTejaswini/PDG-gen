import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int answer = 1;
        for(int i = 0;i<n;i++){   
            if(answer <k){
                answer *= 2;
            }else{
                answer += k;
            }
        }
        System.out.println(answer);
    }
}