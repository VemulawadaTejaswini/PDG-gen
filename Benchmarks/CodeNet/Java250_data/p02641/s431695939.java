import java.util.*;

public class Main{

public static void main(String[] args) {
Scanner scn=new Scanner (System.in);
int x=scn.nextInt();
int n=scn.nextInt();
int []arr=new int[n];
boolean team=false;
for(int i=0;i<n;i++){
    arr[i]=scn.nextInt();
    if(arr[i]==x){
        team=true;
    }
}
Arrays.sort(arr);
if(arr.length==0){
    System.out.println(x);
    return;
}
if( team==false){
    System.out.println(x);
    return;
}
int idx=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==x){
        idx=i;
    }
    
}

int p1=idx+1;
int p2=idx-1;
int val=1;
while(p1!=arr.length && p2!=-1){
    if(arr[p2]!=x-val){
      
        System.out.println(x-val);
        return;
    }
    if(arr[p1]!=x+val){
         
        System.out.println(x+val);
        return;
    }
    val++;
    p2--;
    p1++;
}
if(p1!=arr.length){

   System.out.println(x-val);
   return;
}
if(p2!=-1){
    
    if(arr[p2]==x-val){
         
        System.out.println(x+val);
        return;
    }
      
     System.out.println(x-val);
     return;
}
System.out.println(arr[0]-1);



 }
}