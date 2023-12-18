import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int a = 0;

            if(n == 0 && x == 0){
                break;
            }else{
                for(int i=1;i<n-1;i++){
                    for(int j=i+1;j<n;j++){
                        for(int k=j+1;k<n+1;k++){
                            if(i+j+k == x) a++;
                        }
                    }
                }
                System.out.println(a);
            }
        }
        sc.close();
    }
}
