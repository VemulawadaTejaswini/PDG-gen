import java.util.*;

public class Main{
    public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
       int[] n=new int[3];
       n[0]=Integer.parseInt(sc.next());
       n[1]=Integer.parseInt(sc.next());
       n[2]=Integer.parseInt(sc.next());

       int count5=0;
       int count7=0;

       for(int i=0;i<3;i++){
         if(n[i]==5) count5++;
         if(n[i]==7) count7++;
       }

       if(count5==2 && count7==1) System.out.println("YES");
       else System.out.println("NO");

    }
}
