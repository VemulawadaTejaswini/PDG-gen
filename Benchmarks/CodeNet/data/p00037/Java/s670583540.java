

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static int[][] mapA = new int[5][4];
    static int[][] mapB = new int[4][5];
    static int x, y, d;
    static boolean flag;
     
    static void U(){
        if(flag==true && y>0 && mapB[y-1][x]==1){
            d=0;
            y--;
            flag = false;
            System.out.print("U");
        }
    }
     
    static void R(){
        if(flag==true && x<4 && mapA[y][x]==1){
            d=1;
            x++;
            flag = false;
            System.out.print("R");
        }
    }
     
    static void D(){
        if(flag==true && y<4 && mapB[y][x]==1){
            d=2;
            y++;
            flag = false;
            System.out.print("D");
        }
    }
     
    static void L(){
        if(flag==true && x>0 && mapA[y][x-1]==1){
            d=3;
            x--;
            flag = false;
            System.out.print("L");
        }
    }
     
    static void solve(){
        Scanner sc = new Scanner(System.in);
         
        for(int i=0;i<9;i++){
            String s = sc.next();
            if(i%2==0){
                for(int j=0;j<4;j++) mapA[i/2][j] = s.codePointAt(j)-48;
            }else{
                for(int j=0;j<5;j++) mapB[i/2][j] = s.codePointAt(j)-48;
            }
        }
        x = 0;
        y = 0;
        d = 1;
 
        while(true){
            flag = true;
            if(d==0){
                L();
                U();
                R();
                D();
            }else if(d==1){
                U();
                R();
                D();
                L();
            }else if(d==2){
                R();
                D();
                L();
                U();
            }else if(d==3){
                D();
                L();
                U();
                R();
            }
             
            if(x==0 && y==0){
                System.out.println();
                break;
            }
        }
    }
    
    static int horW[]=new int[20],verW[]=new int[20];
    public static void main(String[] args)  {
        solve(); if(horW[0]==0)return;
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        ArrayList<Character>walk=new ArrayList<Character>();
        while((line=br.readLine())!=null){
            for(int i=0;i<4;i++) horW[i]=Integer.parseInt(line.charAt(i)+"");
            for(int i=0;i<4;i++){
                
                line=br.readLine();
                for(int j=0;j<5;j++)verW[5*i+j]=Integer.parseInt(line.charAt(j)+"");
                line=br.readLine();
                for(int j=0;j<4;j++)horW[4*(i+1)+j]=Integer.parseInt(line.charAt(j)+"");
                
            }
            break;
        }
            //System.out.println("hW"+Arrays.toString(horW));
            //System.out.println("vW"+Arrays.toString(verW));
        walk.add('R');
        walkon(walk,1,0);
        for(char ch : walk) System.out.print(ch+"");
            System.out.println("");
              
        }catch(Exception e){}
    }
    static void walkon(ArrayList<Character>walk,int x, int y){
        char preD=walk.get(walk.size()-1);char nextD='1';int nX=x,nY=y;
        int uW = (y==0)? 0:verW[(y-1)*5+x]; int dW = (y==4)? 0: verW[y*5+x];
        int rW = (x==4)? 0:horW[x+4*y]; int lW =(x==0)? 0: horW[x-1+4*y];
        switch(preD){
            case 'R':
                if(uW==1){nextD='U';nY--;}
                else if(rW==1){nextD='R';nX++;}else if(dW==1){nextD='D';nY++;}
                break;
            case 'U':
                if(lW==1){nextD='L';nX--;}else if(uW==1){nextD='U';nY--;}
                else if(rW==1){nextD='R';nX++;}
                break;
            case 'L':
                if(dW==1){nextD='D';nY++;}else if(lW==1){nextD='L';nX--;}
                else if(uW==1){nextD='U';nY--;}break;
            case 'D':
                if(rW==1){nextD='R';nX++;}else if(dW==1){nextD='D';nY++;}
                else if(lW==1){nextD='L';nX--;}break;
        }
        walk.add(nextD);
        if(nX==0&&nY==0)return ;
        else walkon(walk,nX,nY);
    }
}