import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 0;
        for(int i =0; i*r<=n; i++){
            for(int j=0; i*r+j*g<=n; j++){
                int all = n -  i*r - j*g;
                if(all%b==0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}