import java.util.*;

class Main{

public static void main(String args[]){

Scanner s =  new Scanner(System.in);
String s1 = s.next();

int count=0,maxcount=0;
for(int i=0;i<s1.length();i++){

if(s1.charAt(i) == 'R')
    count++;
else
    if(count>maxcount){
        maxcount=count;
}
count=0;
       
}

System.out.println(maxcount);

}
}