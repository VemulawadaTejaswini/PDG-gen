import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x,y,exe_time=0,exe_e=0,exe_s=0,num=1;
        x=sc.nextInt();
        y=sc.nextInt();
        for(int a=0;a<y;a++){
            num = num*2;
        }
        exe_e = 1900*y*num;
        exe_s = 100*(x-y);
        exe_s = exe_s*num;
        exe_time = (exe_s+exe_e);
        System.out.println(exe_time);
    }
}
