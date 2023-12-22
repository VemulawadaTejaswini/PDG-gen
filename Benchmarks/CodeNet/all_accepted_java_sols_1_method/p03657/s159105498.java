import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
String pos = "Impossible";
if(a % 3 == 0){
pos = "Possible";
}
if(b % 3 == 0){
pos = "Possible";
}
if((a + b) % 3 == 0){
pos = "Possible";
}
System.out.println(pos);

}
}