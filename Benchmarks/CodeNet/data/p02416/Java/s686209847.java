import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
 int ans=0;
 String r=sc.next();
   if(r.equals("0"))break;
   
 while(r.length()!=0){
     for(char i='0';i<='9';i++){
     int j=0;
     r=r.substring(0,r.length()-j);
         if(r.charAt(j)==i){ans+=Integer.parseInt(String.valueOf(i));}
         
     j++;
     }
     
 
 
 }
 System.out.println(ans);
}
}
}
