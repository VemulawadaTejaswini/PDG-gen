import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int a,b;
        int pa,pb;
        while((n=sc.nextInt())!=0){
            pa=0;  pb=0;
            for(int i=0;i<n;i++){
                a=sc.nextInt();
                b=sc.nextInt();
                if(a>b){pa+=a+b;}
                else if(a<b){pb+=a+b;}
                else if(a==b){pa+=a;  pb+=b;}
            }
            System.out.println(pa+" "+pb);
        }
    }
}
