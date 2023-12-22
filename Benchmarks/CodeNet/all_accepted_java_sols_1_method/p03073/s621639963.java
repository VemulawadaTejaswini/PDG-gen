import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []a=sc.next().split("",0);
        String[]aa=new String[]{"0","1"};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i].equals(aa[i%2]))count++;
        }
        System.out.println(Math.min(count,a.length-count));
    }
}
