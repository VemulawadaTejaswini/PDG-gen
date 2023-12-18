

import java.util.*;
public class Main{

public static void main(String[] args){
Scanner obj=new Scanner(System.in);

int n=obj.nextInt();
int[] x=new int[n];
int[] count=new int[n];
int j=0;
x[0]=obj.nextInt();


for(int i=1;i<x.length;i++){
x[i]=obj.nextInt();

if(x[i-1]>=x[i]){
count[j]++;
}
else{
j++;
}

}
Arrays.sort(count);
System.out.println(count[count.length-1]);





}



}