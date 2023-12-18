import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int cnt=0;
        Scanner sc=new Scanner(System.in);
        String a=sc.next();        
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}