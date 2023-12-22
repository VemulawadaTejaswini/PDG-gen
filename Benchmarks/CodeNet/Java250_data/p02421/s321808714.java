import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int ts=0;
         int hs=0;
         for(int i=0;i<n;i++){
        	 String t = sc.next();
             String h = sc.next();
           if(t.compareTo(h)>0){
             ts=ts+3;
             }
            else if(h.compareTo(t)>0){
             hs=hs+3;
           }else{
             hs++;
             ts++;
           }
         }
            System.out.println(ts+" "+hs);
  } 
}
