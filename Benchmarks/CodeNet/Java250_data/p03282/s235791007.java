import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
String str  = sc.next();
long K = sc.nextLong();
boolean ended = false;
//int count=0;

for(int i=0;i<K;i++){
  char value = str.charAt(i);
  if(value != '1'){
    System.out.println(value);
    ended=true;
    break;
  }
}

if(!ended){
  System.out.println('1');
}

}
}
