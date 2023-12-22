import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int ts = 0;
        int hs = 0;
        for(int i=0; i<n;i++){
            String t = s.next();
            String h = s.next();
            if(0<h.compareTo(t)){
                hs=hs+3;
            }
            if(0<t.compareTo(h)){
                ts=ts+3;
            }
            if(0==t.compareTo(h)){
                ts=ts+1;
                hs=hs+1;
            }
        }
        System.out.println(ts+" "+hs);
    }
}
