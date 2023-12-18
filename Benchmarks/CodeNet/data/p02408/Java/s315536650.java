import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
String num,mark="";
ArrayList<String> S=new ArrayList();
ArrayList<String> H=new ArrayList();
ArrayList<String> C=new ArrayList();
ArrayList<String> D=new ArrayList();
for(int i=0;i<4;i++){
    if(i==0)mark="S ";
    if(i==1)mark="H ";
    if(i==2)mark="C ";
    if(i==3)mark="D ";
        for(int j=0;j<13;j++){
        num=String.valueOf(j+1);
        switch(mark){
            case "S ":
                S.add(mark+num);
            break;
            
            case "H ":
                H.add(mark+num);
            break;
            
            case "C ":
                C.add(mark+num);
            break;
            
            case "D ":
                D.add(mark+num);
            break;
        }
        }
}


for(int i=0;i<n;i++){
String mark1=sc.next();
String num1=sc.next();
String str=mark1+" "+num1;
switch(mark1){
    case "S":
        S.remove(str);
    break;
    case "H":
        H.remove(str);
    break;
    case "C":
        C.remove(str);
    break;
    case "D":
        D.remove(str);
    break;
}
}

for(String i:S){
System.out.println(i);
}
for(String i:H){
System.out.println(i);
}
for(String i:C){
System.out.println(i);
}
for(String i:D){
System.out.println(i);
}

}
}
