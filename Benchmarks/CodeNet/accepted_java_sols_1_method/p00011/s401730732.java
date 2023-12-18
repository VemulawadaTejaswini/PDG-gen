import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String word = sc.next();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int num[] = new int[w];
        for(int i=0;i<w;i++){
            num[i] = i+1;
        }
        //String a[] = new String[2];
        String tmp;
        int tmpNum;
        for(int i=0;i<n;i++){
            tmp = sc.next();
            String a[] = tmp.split(",",0);
            //System.out.println(a[0]);
            tmpNum = num[Integer.parseInt(a[0])-1];
            num[Integer.parseInt(a[0])-1] = num[Integer.parseInt(a[1])-1];
            num[Integer.parseInt(a[1])-1] = tmpNum;
        }
        for(int i=0;i<w;i++){
            System.out.println(num[i]);
        }
        sc.close();
    }
}
