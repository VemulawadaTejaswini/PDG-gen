import java.util.Arrays;
import java.util.Scanner;

class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        String x="",y="";
        x=Integer.toString(a[2])+Integer.toString(a[1]);
        y=Integer.toString(a[0]);
        
        System.out.println(Integer.parseInt(y)+Integer.parseInt(x));
        
    }
}