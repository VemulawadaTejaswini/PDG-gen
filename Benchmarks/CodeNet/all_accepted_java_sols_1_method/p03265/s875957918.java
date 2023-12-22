import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int[] res = new int[4];
        res[0]=x2-(y2-y1);
        res[1]=y2+(x2-x1);
        res[2]=x1+res[0]-x2;
        res[3]=y1+res[1]-y2;

        for(int i=0;i<4;i++) System.out.println(res[i]);
    }
}
