import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] x={scan.nextInt(),scan.nextInt()};
        
        while(x[0]!=0||x[1]!=0){
        if(x[0]>x[1]){
            x[0]^=x[1];
            x[1]^=x[0];
            x[0]^=x[1];
        }
        System.out.println(x[0]+" "+x[1]);
        x[0]=scan.nextInt();
        x[1]=scan.nextInt();
        }
    }
}
