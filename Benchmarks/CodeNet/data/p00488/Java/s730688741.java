import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
 int p=2000,j=2000;
 for(int i=0;i<3;i++)p=Math.min(p, sc.nextInt());
 for(int i=0;i<2;i++)j=Math.min(j, sc.nextInt());
 System.out.println(p+j-50);
    }
}