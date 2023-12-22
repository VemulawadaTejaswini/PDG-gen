import java.util.*;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean [] seat =new boolean[100000];
        int ans =0;
        Arrays.fill(seat,false);
        for(int i=0;i<N;i++){
            int start =sc.nextInt();
            int end =sc.nextInt();
            for(int j=start-1;j<end;j++){
                seat[j]=true;
            }
        }
        for(int i =0;i<100000;i++){
            if(seat[i]==true){
                ans++;
            }
        }
        System.out.println(ans);
    }
}