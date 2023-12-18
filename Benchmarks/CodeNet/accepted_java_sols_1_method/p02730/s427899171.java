import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        int n,tmp;
        boolean flag;
        flag=true;
        s=scan.next();
        n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                flag=false;
                break;
            }
        }
        if(flag==true){
            tmp=(n-1)/2;
            for(int i=0;i<tmp/2;i++){
                if(s.charAt(i)!=s.charAt(tmp-i-1)){
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true){
            tmp=(n+3)/2;
            for(int i=tmp-1;i<(n-tmp)/2;i++){
                if(s.charAt(i)!=s.charAt(n-1-i)){
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true) System.out.println("Yes");
        else System.out.println("No");
    }
}