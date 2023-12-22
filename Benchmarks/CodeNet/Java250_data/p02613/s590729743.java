import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] list = new String[N];
        for(int i=0; i<N; i++){
            list[i] = sc.next();
        }
        int[] array = new int[4];
        for(String s :list){
            if(s.equals("AC")){
                array[0] = array[0]+1;
            }else if(s.equals("WA")){
                array[1] = array[1]+1;
            }else if(s.equals("TLE")){
                array[2] = array[2]+1;
            }else if(s.equals("RE")){
                array[3] = array[3]+1;
            }
        }
        String[] ans = {"AC x ","WA x ","TLE x ","RE x " };
        for(int i=0;i<4; i++){
            System.out.println(ans[i] + array[i]);
        }
    }
}
