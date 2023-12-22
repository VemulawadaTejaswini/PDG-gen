import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cntc=0;
        int cnt = 0;
        int num=0;;
        Boolean flag  = false;

        if(s.charAt(0)=='A'){
            for(int i = 2;i<s.length()-1;i++){
                if(s.charAt(i)=='C'){
                    cntc++;
                    num = i;
                }

            }
            if(cntc==1){
                for(int i =1;i<s.length();i++){
                    if(i!=(num) && s.charAt(i)<123 && s.charAt(i)>96){
                        cnt++;
                    }

                }

                if(cnt==s.length()-2){
                    flag = true;
                }
            }
        }

        if(flag){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }

    }
}
