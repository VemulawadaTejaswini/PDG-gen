import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
static  Scanner sc = new Scanner(System.in);


public static void main(String[] args) {

int n=Integer.parseInt(sc.nextLine());
int[] num=new int[n];
for(int i=0;i<n;i++){
num[i]=Integer.parseInt(sc.nextLine());
}
Arrays.sort(num);
int res=0;
for(int i=0;i<n-1;i++){
res+=num[i];
}
res+=num[n-1]/2;
System.out.println(res);

}

}


