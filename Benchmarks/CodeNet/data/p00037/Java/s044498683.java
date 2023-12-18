import static color.ImageUtility.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Main {
    
    static int horW[]=new int[20],verW[]=new int[20];
    public static void main(String[] args)  {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        ArrayList<Character>walk=new ArrayList<Character>();
        while((line=br.readLine())!=null){
            for(int i=0;i<4;i++) horW[i]=Integer.parseInt(line.charAt(i)+"");
            for(int i=0;i<4;i++){
                line=br.readLine();for(int j=0;j<4;j++)horW[4*(i+1)+j]=Integer.parseInt(line.charAt(j)+"");
                line=br.readLine();for(int j=0;j<5;j++)verW[5*i+j]=Integer.parseInt(line.charAt(j)+"");
            }
            break;
        }
        walk.add('R');
        walkon(walk,1,0);
        for(char ch : walk) System.out.print(ch);
            System.out.println("");
              
        }catch(Exception e){}
    }
    static boolean walkon(ArrayList<Character>walk,int x, int y){
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
        if(nX==0&&nY==0)return true;
        else return walkon(walk,nX,nY);
    }
}