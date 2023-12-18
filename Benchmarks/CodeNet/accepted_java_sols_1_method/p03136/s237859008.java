import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
static  Scanner sc = new Scanner(System.in);


public static void main(String[] args) {

int N=Integer.parseInt(sc.nextLine());

String[] nyu=sc.nextLine().split(" ");
int[] num=new int[nyu.length];

for(int i=0;i<nyu.length;i++){
num[i]=Integer.parseInt(nyu[i]);
}
Arrays.sort(num);
int min=0;
for(int i=0;i<nyu.length-1;i++){
min+=num[i];
}
if(num[num.length-1]<min)
System.out.println("Yes");
else
System.out.println("No");



}

}


