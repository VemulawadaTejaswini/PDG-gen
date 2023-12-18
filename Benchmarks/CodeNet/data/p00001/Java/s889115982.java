import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int[]list=new int[3];
        int x;
        for(int i=0;i<10;i++){
            x=s.nextInt();fun(x,list);
        }
        for(int i=0;i<3;i++){
            System.out.println(list[i]);
        }
    }
    
    static int[] fun(int x,int[] z){
        if(z[0]<x){z[2]=z[1];z[1]=z[0];z[0]=x;}
        else if(z[1]<x){z[2]=z[1];z[1]=x;}
        else if(z[2]<x){z[2]=x;}
        return z;
    }
}
