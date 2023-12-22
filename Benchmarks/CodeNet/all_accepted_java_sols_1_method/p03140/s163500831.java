import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s=new String[3];
        sc.nextInt();
        for(int i=0;i<3;i++){
            s[i]=sc.next();
        }
        char[] c=new char[3];
        int output=0;
        int tmp=0;
        for(int i=0;i<s[0].length();i++){
            for(int j=0;j<3;j++){
                c[j]=s[j].charAt(i);
            }
            tmp=2;
            if(c[0]==c[1])tmp-=1;
            if(c[0]==c[2])tmp-=1;
            if(c[1]==c[2])tmp=tmp==0?0:tmp-1;
            output+=tmp;
        }
        System.out.println(output);

    }

}