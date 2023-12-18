import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan =new Scanner(System.in);
        while(tan.hasNext()){
            int i=0,sum=0;
            String s,t;
            s=tan.next();
            t=tan.next();
            char []a=new char[s.length()];
            char []b=new char[t.length()];
            for (char c : s.toCharArray()){
                a[i]=c;
                i++;
            }
            i=0;
            for (char ch : t.toCharArray()){
                b[i]=ch;
                i++;
            }
            for (int j = 0; j <t.length() ; j++) {
                if(a[j]!=b[j]){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
