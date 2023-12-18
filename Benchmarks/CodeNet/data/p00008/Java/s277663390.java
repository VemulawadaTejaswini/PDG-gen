import java.util.*;

public class Main {
    static int fun(int n){
        int ans=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    for (int l=0;l<10;l++){
                        if(i+j+k+l==n)ans+=1;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        System.out.println(fun(sc.nextInt()));
    }
    }
}
