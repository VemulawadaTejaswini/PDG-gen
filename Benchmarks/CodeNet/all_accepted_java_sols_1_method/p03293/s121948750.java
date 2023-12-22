import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String ans="No";
String s=sc.next();
String t=sc.next();
int n=s.length();
int temp=0;
int count=0;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(s.charAt(j)!=t.charAt((j+temp)%n)){temp++;count=0;break;}else{count++;}
    
    }
if(count==n){ans="Yes";break;}
}

System.out.println(ans);


}}