import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int []k = new int[32];
        k[0]=1;
        k[1]=1;
        k[2]=1;
        k[3]=2;
        k[4]=1;
        k[5]=2;
        k[6]=1;
        k[7]=5;
        k[8]=2;
        k[9]=2;
        k[10]=1;
        k[11]=5;
        k[12]=1;
        k[13]=2;
        k[14]=1;
        k[15]=14;
        k[16]=1;
        k[17]=5;
        k[18]=1;
        k[19]=5;
        k[20]=2;
        k[21]=2;
        k[22]=1;
        k[23]=15;
        k[24]=2;
        k[25]=2;
        k[26]=5;
        k[27]=4;
        k[28]=1;
        k[29]=4;
        k[30]=1;
        k[31]=51;
        int a = sc.nextInt();
        System.out.println(k[a-1]);
        sc.close();
    }
}