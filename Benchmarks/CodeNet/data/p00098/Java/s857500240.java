
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
 
 
 
 class Main{
      
    static int aa[][];//
    static int n;
    static int max=Integer.MIN_VALUE;
    static HashMap<Integer, Integer> hT = new HashMap<Integer,Integer>();
    static HashMap<Integer, Integer> hT_nex = new HashMap<Integer,Integer>();
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{
             String line;
             line=br.readLine();n=Integer.parseInt(line);
             aa=new int[n][n];//y-x
             for(int i=0; i<n;i++){String spl[] = br.readLine().split(" ");
                for(int j=0;j<n;j++){
                    if(i==0){if(j==0)aa[i][j]=Integer.parseInt(spl[j]);
                        else aa[i][j]=aa[i][j-1]+Integer.parseInt(spl[j]);
                    }else{
                        if(j==0)aa[i][j]=aa[i-1][j]+Integer.parseInt(spl[j]);
                        else aa[i][j]=Integer.parseInt(spl[j])+aa[i-1][j]+aa[i][j-1]-aa[i-1][j-1];
                    }
             }}

            {if(aa[0][0]>max)max=aa[0][0];}
            {for(int wX=1;wX<n;wX++){if(aa[0][wX]>max)max=aa[0][wX];}}
            {for(int wY=1;wY<n;wY++){if(aa[wY][0]>max)max=aa[wY][0];}}
             for(int x=1;x<n;x++){
                 for(int y=1;y<n;y++){
                     for(int wX=0;wX<=x;wX++){
                         for(int wY=0;wY<=y;wY++){
                             int cal=0;
                             if(wX==x&&wY==y){cal=aa[y][x];}
                             else if(wX==x){cal=aa[y][x]-aa[y-wY-1][x];}
                             else if(wY==y){cal=aa[y][x]-aa[y][x-wX-1];}
                             else{cal=aa[y][x]-aa[y-wY-1][x]-aa[y][x-wX-1]+aa[y-wY-1][x-wX-1];}
                             if(cal>max)max=cal;
                         }
                     }
                 }
             }
             
             System.out.println(max);
             
         }catch(Exception e){}         
     }
      
    
 }