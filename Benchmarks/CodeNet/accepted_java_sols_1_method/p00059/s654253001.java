import java.io.PrintWriter;
import java.util.*;
class Main {
    public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 PrintWriter out=new PrintWriter(System.out);
    	 while(sc.hasNext()){
             double [] ax = new double[2];
             double [] ay = new double[2];
             double [] bx = new double[2];
             double [] by = new double[2];
             for(int i=0;i<ax.length;i++){
                 ax[i]=sc.nextDouble();
                 ay[i]=sc.nextDouble();
             }
             for(int i=0;i<bx.length;i++){
                 bx[i] =sc.nextDouble();
                 by[i] =sc.nextDouble();
             }
             boolean judge = true;
             if(bx[1]<ax[0]|ax[1]<bx[0])judge=false;
             if(ay[1]<by[0]|by[1]<ay[0])judge=false;
             if(judge) out.println("YES");
             else out.println("NO");
         }
    	 out.flush();
    	 out.close();
    	 sc.close();
    }
}