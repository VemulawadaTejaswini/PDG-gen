import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.next().toCharArray();
        char b[]=sc.next().toCharArray();
        int po[]=new int [129];
        int po2[]=new int [129];
        boolean bb=true;
        for(int i=0;i<a.length;i++)
            if(po[a[i]]==po2[b[i]]){
                po[a[i]]=i;
                po2[b[i]]=i;
            }
            else {
                bb=false;
                break;
            }
        System.out.println(bb?"Yes":"No");
    }
}
