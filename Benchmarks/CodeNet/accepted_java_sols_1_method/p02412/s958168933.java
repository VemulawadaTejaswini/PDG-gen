import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==0 && b == 0){
                break;
            }else{
                int ans = 0;
                for(int i = 1 ; i <= a-2 ; i++){
                    for(int j = i+1 ; j <= a-1 ; j++){
                        for(int k = j+1 ; k <= a ; k++){
                            if(i+j+k == b){
                                ans++;
                            }else{
                            }
                        }
                    }
                }
                System.out.println(ans);
            }
        }
    }
}

