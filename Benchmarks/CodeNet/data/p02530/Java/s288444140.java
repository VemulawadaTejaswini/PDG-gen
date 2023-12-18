import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int t=0,h=0;
        for(int i=0;i<n;i++){
            String[] s=sc.nextLine().split(" ");
            double c=s[0].compareTo(s[1]);
            if(c==0.0){
                t++;
                h++;
            }else if(c>0){
                t+=3;
            }else{
                h+=3;
            }
        }
        System.out.println(t+" "+h);
    }
}