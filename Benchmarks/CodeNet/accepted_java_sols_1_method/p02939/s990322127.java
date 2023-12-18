import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] c=sc.next().toCharArray();
        int k=0;
        for(int i=0, s=0;i<c.length;++i){
            if(i==0 || c[i]!=s){
                s=c[i];
                k++;
            } else if(++i<c.length){
                s=0;
                k++;
            }
        }
        System.out.println(k);
    }
}
