import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
int N=scan.nextInt();
        int K=scan.nextInt();
int p[]=new int [N];
for (int i=0;i<N;i++){p[i]=scan.nextInt();}
Arrays.sort(p);
int j=0;
for(int i=0;i<K;i++){j=j+p[i];}
System.out.println(j);

    }
    }


