import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
   int t=0; 
   for(int i=0;i<4;i++) t+=sc.nextInt();
    System.out.println(t/60);
    System.out.println(t%60);
    }
    }