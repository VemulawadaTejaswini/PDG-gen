import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[]f=new char[26],t=new char[26];
        char[]a=s.next().toCharArray(),b=s.next().toCharArray();
        
        for(int i=0;i<a.length;++i){
            if((t[a[i]-'a']!=0&&t[a[i]-'a']!=b[i])
                ||(f[b[i]-'a']!=0&&f[b[i]-'a']!=a[i])){
                System.out.println("No");
                return;
            }
            t[a[i]-'a']=b[i];
            f[b[i]-'a']=a[i];
        }
        System.out.println("Yes");
    }
}
