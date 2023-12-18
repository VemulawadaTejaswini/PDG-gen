import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
String m = sc.nextLine();
String n = sc.nextLine();
String m1 = m.substring(0,1);
String n1 = n.substring(0,1);
String m2 = m.substring(1,2);
String n2 = n.substring(1,2);
String m3 = m.substring(2);
String n3 = n.substring(2);
int i = 0;


        if (m.equals(n)){
                        System.out.println(3);
}else{
if(m1.equals(n1)) i++;
if(m2.equals(n2)) i++;
if(m3.equals(n3)) i++;
System.out.println(i);
}


        sc.close();
    }
}
