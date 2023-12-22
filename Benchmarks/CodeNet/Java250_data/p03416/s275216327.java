import java.util.*;
class Main{
 static public void main(String[] args){
  Scanner sc=new Scanner(System.in);
   int a=sc.nextInt(),b=sc.nextInt();
   int count=0;
   for(int i=a;i<=b;i++){
    if(j(Integer.toString(i)))count++;
   }
   System.out.print(count);
   sc.close();
 }
 static boolean j(String a){
    int in=0;
    int ind=a.length()-1;
    while(in<ind){
        if(a.charAt(in++)!=a.charAt(ind--))return false;
    }
    return true;
 }
}
