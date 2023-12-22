
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scn=new Scanner(System.in);
                String s=scn.next();
                int ans=0;
                for(int i=0;i<s.length();i++){
                        if(s.charAt(i)=='1'){
                                ans++;
                        }
                }
                System.out.println(ans);
        }
}