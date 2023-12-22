import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String l[]="ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("",0);
        String po=sc.next();
        int i=0;
        while(po.length()==4){
            po=po.replace(l[i],"");
            i++;
        }
        if(po.length()==2){
            i=0;
            while(po.length()==2){
                po=po.replace(l[i],"");
                i++;
            }
            if(po.length()==0)
            System.out.println("Yes");
            else 
            System.out.println("No");
        }
        else
            System.out.println("No");
    }
}
