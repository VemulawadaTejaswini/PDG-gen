import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       int x=s.nextInt(),y=s.nextInt();
       int res=0;
       if(x==1){res+=300000;}
       else if(x==2){res+=200000;}
        else if(x==3){res+=100000;}
        if(y==1){res+=300000;}
       else if(y==2){res+=200000;}
        else if(y==3){res+=100000;}
        if(x==1&&y==1){res+=400000;}
        System.out.println(res);
        }
    }
