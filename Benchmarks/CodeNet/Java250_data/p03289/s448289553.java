import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s=sc.next();
String t=s;
boolean f=false;
int count=0;
for(int i=0;i<s.length()-3;i++){if(s.charAt(i+2)=='C')count++;}
for(char i='A';i<='Z';i++){t=t.replaceAll(String.valueOf(i), "");}
if(s.charAt(0)=='A'){
    if(count==1){
        if(t.length()==s.length()-2){
        f=true;
        }
    }
}
if(f){System.out.println("AC");}else{System.out.println("WA");}
}}