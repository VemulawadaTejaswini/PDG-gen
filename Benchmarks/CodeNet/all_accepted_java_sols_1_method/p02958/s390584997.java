import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int ans=0;
        boolean flg=true;
        for(int i=0;i<a;i++){
            int c=scan.nextInt();
            if(i+1!=c){
                ans+=1;
                if(ans==3){flg=false;break;}
            }
        }
        String b = flg?"YES":"NO";
        System.out.println(b);
    }
}