import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int quantam=scan.nextInt();
        int erapsedTime=0;
        ArrayList<String> pname=new ArrayList<String>();
        ArrayList<Integer> ptime=new ArrayList<Integer>();
        
        for(int i=0; i<n; i++){
            pname.add(scan.next());
            ptime.add(scan.nextInt());
        }
        //System.out.println(pname+":"+ptime);
        
        while(ptime.size()!=0){
            if(ptime.get(0)<=quantam){
                erapsedTime+=ptime.remove(0);
                System.out.println(pname.remove(0)+" "+erapsedTime);
            }
            else{
                ptime.add(ptime.remove(0)-quantam);
                pname.add(pname.remove(0));
                erapsedTime+=quantam;
            }
        }
    }
}
