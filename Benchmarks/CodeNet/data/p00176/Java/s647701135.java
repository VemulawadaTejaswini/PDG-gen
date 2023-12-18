import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       int [][] color={ {0,0,0},{0,0255},{0,255,0},{0,255,255},{255,0,0},{255,0,255},{255,255,0},{255,255,255} };
       String [] name ={"black","blue","lime","aqua","red","fuchsia","yellow","white"};
       
       Scanner sc = new Scanner(System.in);
       
       /* int [][] c = new int[8][3];
       for(int i=0;i<8;i++){
           for(int j=0;j<3;j++){
               c[i][j]=Integer.parseInt(color[i][j],16);
              // System.out.print(c[i][j]);
           }
           // System.out.println();
       }
       */
       
       while(sc.hasNextLine()){
           String str = sc.nextLine();
           if(str.equals("0")) break;
           String ans = "";
           double min = 450.0;
           for(int i=0;i<8;i++){
               double d = Math.sqrt( (Integer.parseInt(str.substring(1,3),16)-color[i][0])*(Integer.parseInt(str.substring(1,3),16)-color[i][0]) + (Integer.parseInt(str.substring(3,5),16)-color[i][1])*(Integer.parseInt(str.substring(3,5),16)-color[i][1]) + (Integer.parseInt(str.substring(5,7),16)-color[i][2])* (Integer.parseInt(str.substring(5,7),16)-color[i][2]));
               if(d<min){
                   min=d;
                   ans=name[i];
               }
           }
           System.out.println(ans);
       }
       
    }
}

