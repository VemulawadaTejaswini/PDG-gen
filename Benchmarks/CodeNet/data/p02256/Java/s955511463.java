import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
        int m =sc.nextInt();
        int reg=0;
        for(int i=1;i<=n&&i<=m;i++){
        	if(n%i==0&&m%i==0){
        		reg=i;
        	}
        }
        System.out.println(reg);
    }
}
