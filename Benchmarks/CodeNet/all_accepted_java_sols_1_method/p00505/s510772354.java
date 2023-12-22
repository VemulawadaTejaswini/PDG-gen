import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int ei=0,cho=0,don=0;
while(true){
int[] a=new int[3];
a[0]=Integer.parseInt(sc.next());
a[1]=Integer.parseInt(sc.next());
a[2]=Integer.parseInt(sc.next());
Arrays.sort(a);
int temp=a[0]+a[1];
int sq1=a[0]*a[0];
int sq2=a[1]*a[1];
int sq3=a[2]*a[2];
int l=sq1+sq2;
if(temp>a[2]){
if(sq3>l){
ei++;
}else if(sq3==l){
cho++;
}else if(sq3<l){
don++;
}

        }else{
    System.out.println((don+cho+ei)+" "+cho+" "+don+" "+ei);
    break;
    }
}

}
}
